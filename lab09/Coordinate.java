/**
 * Represents a coordinate point.
 */
public class Coordinate {
  /**
   * Constructs a Coordinate object with the specified coordinates.
   * @param x The x-coordinate.
   * @param y The y-coordinate.
   */
  //improvement comment: Add walls that the snake must avoid to increase the challenge.
  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  int x;
  int y;
  /**
   * Checks if this coordinate is equal to another object.
   * @param obj The object to compare with.
   * @return true if the coordinates are equal, false otherwise.
   */

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Coordinate) {
      Coordinate other = (Coordinate) obj;
      return other.x == this.x && other.y == this.y;
    }

    return false;
  }
  //internal comments:hashcode
}
