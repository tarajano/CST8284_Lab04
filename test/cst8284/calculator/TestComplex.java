package test.cst8284.calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import test.cst8284.calculator.*;
import cst8284.calculator.Complex;

public class TestComplex {

  private static final double DELTA = 0.00000001;
  private static String cn3plus2i = "3+2i";
  
  // 1. Use assertNotNull() to test the Complex(String, String) constructor (1 mark)
  @Test
  public void exc1TestComplex() {
    Complex cn = new Complex("3","2i");
    assertNotNull(cn);
  }
  
  // 2. Use assertEquals(double, double, double) to test if getImag() returns
  // the correct value set using the Complex(String) constructor (1 mark)
  @Test
  public void exc2TestGetImag() {
    Complex cn = new Complex(cn3plus2i);
    assertEquals(2.0, cn.getImag(), DELTA);
  }
  
  //  3. Use assertEquals(double, double, double) to test if setImag()
  //  correctly resets the value set using the Complex(String[]) constructor (1 mark)
  @Test
  public void exc3TestSetImag() {
    String[] array = {"3", "1i"};
    Complex cn = new Complex(array);
    cn.setImag(2);
    assertEquals(2.0, cn.getImag(), DELTA);    
  }
  
  //  4. Use the no-arg Complex() constructor, and then use the real and imaginary setters
  //  to set new integer values.  Then use assertTrue(boolean) to test the validity of your
  //  newly-added equals(String) method (1 mark)
  @Test
  public void exc4TestEqualsStringTrue() {
    Complex cn = new Complex(cn3plus2i);
    assertTrue(cn.equals(cn3plus2i));
  }
  
  // MAAT: Testing an assertFalse (sometimes equally important)
  @Test
  public void exc4TestEqualsStringFalse() {
    Complex cn = new Complex(cn3plus2i);
    assertFalse(cn.equals("3+1i"));
  }
  
  // 6. Using the Complex(String) constructor, test to see if your code is 
  // robust enough to handle extra spaces in the test String, e.g. '3  +    2i  '
  // with a varying number of spaces (Hint: use one or more for() loops) (3 marks)
  private Complex cnExc6 = new Complex("    3       +   2  i       ");
  @Test
  public void exc6TestExtraSpacesConstructor() {
    assertNotNull(cnExc6);
  }
  @Test
  public void exc6testEqualsStringTrue() {
    assertTrue(cnExc6.equals(cn3plus2i));
  }  
  
}





