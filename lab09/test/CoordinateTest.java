import static org.junit.Assert.*;

public class CoordinateTest {

  @org.junit.Test
  public void testEquals() {
    // Test when two coordinates are equal
    Coordinate coord1 = new Coordinate(5, 10);
    Coordinate coord2 = new Coordinate(5, 10);

    assertTrue("Coordinates with same values should be equal", coord1.equals(coord2));

    // Test when two coordinates are not equal
    Coordinate coord3 = new Coordinate(3, 8);
    assertFalse("Different coordinates should not be equal", coord1.equals(coord3));
  }
}
