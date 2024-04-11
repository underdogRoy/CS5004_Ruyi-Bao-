import java.util.List;

/**
 * Interface for the Snake Game model.
 */
public interface SnakeGameModel {
  /**
   * Gets the locations of the snake's body segments.
   *
   * @return List of Coordinate representing the snake's locations.
   */
  List<Coordinate> getSnakeLoc();
  /**
   * Gets the location of the apple.
   *
   * @return Coordinate representing the apple's location.
   */
  Coordinate getAppleLoc();
  /**
   * Gets the current direction of the snake.
   *
   * @return Current direction (1 = up, 2 = down, 3 = left, 4 = right).
   */
  int getDirection();
  /**
   * Sets the direction of the snake.
   *
   * @param direction New direction to set (1 = up, 2 = down, 3 = left, 4 = right).
   */
  void setDirection(int direction);
  /**
   * Moves the snake based on its current direction.
   */
  void moveSnake();
  /**
   * Regenerates the apple at a random location on the game grid.
   */
  void regenApple();

}
