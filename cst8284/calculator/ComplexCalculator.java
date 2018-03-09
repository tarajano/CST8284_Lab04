package cst8284.calculator;

public class ComplexCalculator {

  private java.util.Scanner op = new java.util.Scanner(System.in);
  private Complex c; // stores result of current calculation for use in next
                     // calculation

  public ComplexCalculator() {}
  
  public ComplexCalculator(Complex c1, Complex c2) {
    System.out.println("Which math operation do you wish to perform?  Enter +, -, *, /");
    char mathOp = op.nextLine().charAt(0);

    switch (mathOp) {
    case '+':
      c = plus(c1, c2);
      break;
    case '-':
      c = subtract(c1, c2);
      break;
    case '*':
      c = multiply(c1, c2);
      break;
    case '/':
      c = divide(c1, c2);
      break;
    default:
      System.out.println("Unknown operation requested");
    }

  }

  public Complex plus(Complex c1, Complex c2) {
    double real = c1.getReal() + c2.getReal();
    double imag = c1.getImag() + c2.getImag();
    c = new Complex(real, imag); // save the result to this class's Complex number
    return (c);
  }

  public Complex subtract(Complex c1, Complex c2) {
    double real = c1.getReal() - c2.getReal();
    double imag = c1.getImag() - c2.getImag();
    c = new Complex(real, imag); // save the result to this class's Complex number
    return (c);
  }

   public Complex multiply(Complex c1, Complex c2){
     double real = (c1.getReal() * c2.getReal()) - (c1.getImag() * c2.getImag());
     double imag = (c1.getReal() * c2.getImag()) + (c2.getReal() * c1.getImag());
     c = new Complex(real, imag); // save the result to this class's Complex number
     return (c);    
   }
   
//   public Complex divide(Complex c1, Complex c2){
//     
//     if ( c2.isZero() ) {
//       System.out.println("Illegal division by zero.");
//       c = new Complex(0,0);
//       return (c);
//     }
//     
//     double denominator = Math.pow(c2.getReal(), 2) + Math.pow(c2.getImag(), 2);
//     double realNumerator = c1.getReal() * c2.getReal() + c1.getImag() * c2.getImag(); 
//     double imagNumerator = c2.getReal() * c1.getImag() - c1.getReal() * c2.getImag();
//     double real = realNumerator / denominator;  
//     double imag = imagNumerator / denominator;
//     c = new Complex(real, imag);
//     return (c);
//   }
  // If attempting Bonus C, comment out the above divide() method, which must
  // use the calculation given in the Lab 03 document--this must be included for
  // marks--and add a new divide() method here that employs the complex conjugate in the
  // Complex class, as described in the BONUS MARKS section of the Lab 3 document.
   public Complex divide(Complex c1, Complex c2){
     
     Complex c2conj = c2.conjugate();
     Complex c2TimesConj= multiply(c2, c2conj);
     
     if ( c2TimesConj.isZero() ) {
       System.out.println("Illegal division by zero.");
       c = new Complex(0,0);
       return (c);
     }
     
     Complex num = multiply(c1, c2conj);
     double denom = c2TimesConj.getReal();

     c = new Complex(num.getReal() / denom, num.getImag() / denom);
     return (c);
  }
   
  public Complex getComplexResult() {
    return this.c;
  }

  public String toString() {
    //return "The result is: " + c.toString();
    return c.toString();
  }

}
