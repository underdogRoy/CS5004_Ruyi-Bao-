/**
 * Fraction interface
 */
public interface Fraction {

  /**
   * Get the numerator of the fraction
   * @return the numerator of the fraction
   */
  int getNumerator();
  /**
   * Get the denominator of the fraction
   * @return the denominator of the fraction
   */
  int getDenominator();

  /**
   * Set the numerator of the fraction
   * @param numerator The new numerator
   */
  void setNumerator(int numerator);
  /**
   * Set the denominator of the fraction
   * @param denominator The new numerator
   * @throws IllegalArgumentException If the new denominator is not positive.
   */
  void setDenominator(int denominator);
  /**
   * Get the scientific value (decimal) of the fraction
   * @return the decimal of the fraction
   */
  double toDouble();


  /**
   * Get a String depicting the fraction’s value
   * @return The simplified string representation.
   */
  String toString();

  /**
   * Get the reciprocal of the fraction.
   * @return The reciprocal fraction
   * @throws ArithmeticException If the numerator is zero.
   */
  Fraction reciprocal();

  /**
   * Add another fraction to this fraction.
   *
   * @param other The fraction to be added.
   * @return The result of the addition as a fraction.
   */
  Fraction add(Fraction other);

  /**
   * Compare this fraction to another fraction.
   *
   * @param other The fraction to compare to.
   * @return A negative integer if (this < other), a positive integer if (this > other), and 0 otherwise.
   */

  int compareTo(Fraction other);


}

