package test.cst8284.calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import test.cst8284.calculator.*;
import cst8284.calculator.Complex;
import cst8284.calculator.ComplexCalculator;

public class TestComplexCalculator {

  @Test
  public void testToString() {
    Complex c = new Complex(3,2);
    assertTrue(c.toString().equals("3.0 + 2.0i"));
  }
  
  //5. Using assertTrue(boolean), test that two Complex numbers created
  //using the Complex(int, int) constructor and the Complex(double, double)
  //constructor give the correct result using the divide() method.
  //Use equals(Complex) to compare the actual and expected result (1 mark)
  /* 
   * For this test I'm using the 2nd test case from Lab03: (7 + 12i) / (4 - 4i) = -0.625 + 2.375i
   * However I note inconsistencies in the expected number of decimals places.
   * In Lab03 (PDF doc), the result for 1st test case has 1 decimal place, while
   * the result for 2nd test case has 3 decimal places. Was this implemented on purpose?
   * I've implemented toString() to display only one decimal place (matching Lab03's 1st test case)   
   */
  @Test
  public void testComplexEqualsComplex() {
    Complex cnExpected = new Complex(-0.625,2.375);
    ComplexCalculator cCalc = new ComplexCalculator();
    Complex cnActual = cCalc.divide(new Complex(7,12), new Complex(4.0,-4.0));
    assertTrue(cnExpected.equals(cnActual));
  }

}
