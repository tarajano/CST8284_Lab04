package test.cst8284.calculator;

import test.cst8284.calculator.*;

import static org.junit.Assert.*;

import org.junit.Test;

import cst8284.calculator.Complex;

public class TestComplex {

  private static final double DELTA = 0.00000001;
  
  // 1. Use assertNotNull() to test the Complex(String, String) constructor (1 mark)
  @Test
  public void testComplex() {
    Complex cn = new Complex("3","2i");
    assertNotNull(cn);
  }
  
  // 2. Use assertEquals(double, double, double) to test if getImag() returns
  // the correct value set using the Complex(String) constructor (1 mark)
  @Test
  public void testGetImag() {
    Complex cn = new Complex("3+2i");
    assertEquals(2.0, cn.getImag(), DELTA);
  }
  
  //  3. Use assertEquals(double, double, double) to test if setImag()
  //  correctly resets the value set using the Complex(String[]) constructor (1 mark)
  @Test
  public void testSetImag() {
    String[] array = {"3", "1i"};
    Complex cn = new Complex(array);
    cn.setImag(2);
    assertEquals(2.0, cn.getImag(), DELTA);    
  }
  
  //  4. Use the no-arg Complex() constructor, and then use the real and imaginary setters
  //  to set new integer values.  Then use assertTrue(boolean) to test the validity of your
  //  newly-added equals(String) method (1 mark)
  @Test
  public void testEqualsStringTrue() {
    Complex cn = new Complex("3+2i");
    assertTrue(cn.equals("3+2i"));
  }
  
  // MAAT: Testing an assertFalse (sometimes equally important)
  @Test
  public void testEqualsStringFalse() {
    Complex cn = new Complex("3+2i");
    assertFalse(cn.equals("3+1i"));
  }
  
  // COMMIT !!!!
  
}





