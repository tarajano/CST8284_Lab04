package test.cst8284.calculator;
import test.cst8284.calculator.*;

import static org.junit.Assert.*;

import org.junit.Test;

import cst8284.calculator.Complex;

public class TestComplexCalculator {

  @Test
  public void testToString() {
    Complex c = new Complex(3,2);
    assertTrue(c.toString().equals("3.0 + 2.0i"));
  }

}
