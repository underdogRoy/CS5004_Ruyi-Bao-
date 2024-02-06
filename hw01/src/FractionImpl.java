public class FractionImpl implements Fraction {
  private int numerator;
  private int denominator;
  public FractionImpl(int numerator,int denominator){
    if (denominator<=0){
      throw new IllegalArgumentException("Denominator must be positive");
    }
    this.denominator=denominator;
    this.numerator=numerator;

  }

  public int getNumerator() {
    return numerator;
  }
  public int getDenominator() {
    return denominator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  public void setDenominator(int denominator) {
    if (denominator<=0){
      throw new IllegalArgumentException("Denominator must be positive");
    }
    this.denominator = denominator;
  }
  public double toDouble(){
    return (double) numerator/denominator;
  }
  public static int GCD(int a, int b) {
    if (b == 0) {
      return a;
    }
    return GCD(b, a % b);
  }

  @Override
  public String toString() {
    int gcd=GCD(numerator,denominator);
    return  numerator/gcd +
        "/" + denominator/gcd;
  }
  public Fraction reciprocal(){
    if (numerator==0){
      throw new IllegalArgumentException("numerator could not be zero for reciprocal");

    }
    return new FractionImpl(denominator,numerator);
  }

  @Override
  public Fraction add(Fraction other) {
    return new FractionImpl((this.numerator* other.getDenominator()+ other.getNumerator()*this.denominator),this.denominator*other.getDenominator());
  }

  @Override
  public int compareTo(Fraction other) {
    int crossmultithis=this.numerator* other.getDenominator();
    int crossmultiother=this.denominator*other.getNumerator();
    return Integer.compare(crossmultithis,crossmultiother);
  }
}
