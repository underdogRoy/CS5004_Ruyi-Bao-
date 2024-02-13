
/**
 * This class represents a triangle.  It defines all the operations mandated by
 * the Shape interface
 */
public class Triangle extends AbstractShape {
  private Point2D point2;
  private Point2D point3;

  /**
   * Constructs a triangle object with the given location of 3 points
   *
   * @param x1      x coordinate of the reference point of this triangle
   * @param y1      y coordinate of the reference point of this triangle
   * @param x2      x coordinate of the second point of this triangle
   * @param y2      y coordinate of the second point of this triangle
   * @param x3      x coordinate of the third point of this triangle
   * @param y3      y coordinate of the third point of this triangle
   */
  public Triangle(double x1, double y1, double x2, double y2,double x3, double y3) {
    super(new Point2D(x1, y2));
    this.point2 = new Point2D(x2,y2);
    this.point3 = new Point2D(x3,y3);
    if (reference.equals(point2)||reference.equals(point3)||point2.equals(point3)){
      throw new IllegalArgumentException("Points must be unique for a triangle.");
    }
  }
  @Override
  public double area() {
    return 0.5 * Math.abs(reference.getX() * (point2.getY() - point3.getY())
        + point2.getX() * (point3.getY() - reference.getY())
        + point3.getX() * (reference.getY() - point2.getY()));
  }

  @Override
  public double perimeter() {
    double side1=reference.distTo(point2);
    double side2=point2.distTo(point3);
    double side3=reference.distTo(point3);
    return side1+side2+side3;
  }

  @Override
  public Shape resize(double factor) {
    double sqrtFactor = Math.sqrt(factor);
    return new Triangle(
        this.reference.getX(),
        this.reference.getY(),
        this.reference.getX() + sqrtFactor * (point2.getX() - this.reference.getX()),
        this.reference.getY() + sqrtFactor * (point2.getY() - this.reference.getY()),
        this.reference.getX() + sqrtFactor * (point3.getX() - this.reference.getX()),
        this.reference.getY() + sqrtFactor * (point3.getY() - this.reference.getY())
    );
  }

  public String toString() {
    return String.format("Triangle: points (%.3f,%.3f),(%.3f,%.3f),(%.3f,%.3f)",
        this.reference.getX(), this.reference.getY(), this.point2.getX(), this.point2.getY(),this.point3.getX(), this.point3.getY());
  }
}