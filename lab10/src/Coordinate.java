import java.util.Objects;
/**
 * Represents a coordinate (x, y) on the game grid.
 */
public class Coordinate {

  /**
   * Constructs a Coordinate object with the specified coordinates.
   *
   * @param x The x-coordinate.
   * @param y The y-coordinate.
   */
  int x;
  int y;

  //improvement comment: Add walls that the snake must avoid to increase the challenge.
  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  /**
   * Checks if this coordinate is equal to another object.
   *
   * @param obj The object to compare with.
   * @return true if the coordinates are equal, false otherwise.
   */

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Coordinate) {
      Coordinate other = (Coordinate) obj;
      return other.x == this.x && other.y == this.y;
      //internal comments:hashcode
    }
    return false;
  }
  /**
   * Generates a hash code for this coordinate.
   *
   * @return The hash code value for this coordinate.
   */
  public int hashCode() {
    return Objects.hash(x, y);
  }
}

