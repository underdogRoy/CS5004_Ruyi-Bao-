import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Implementation of the SnakeGameModel interface.
 */
public class SnakeGameModelImpl implements SnakeGameModel {

  private List<Coordinate> snakeLoc;
  private Coordinate appleLoc;
  private int dotSize = 10;
  private int direction;
  private Random rnd = new Random();






  public SnakeGameModelImpl() {
      snakeLoc = new ArrayList<>();
      snakeLoc.add(new Coordinate(50, 50));
      snakeLoc.add(new Coordinate(50 + dotSize, 50));
      snakeLoc.add(new Coordinate(50 + 2 * dotSize, 50));
      direction = 1; // up
      regenApple();
    }

    public List<Coordinate> getSnakeLoc () {
      return snakeLoc;
    }

    public Coordinate getAppleLoc () {
      return appleLoc;
    }

    public int getDirection () {
      return direction;
    }

    public void setDirection ( int direction){
      this.direction = direction;
    }

    public void moveSnake () {
      Coordinate old_tail = snakeLoc.remove(snakeLoc.size()-1);
      // TODO: what if size is 1
      // 2. get the loc of the old head
      int old_head_x = snakeLoc.get(0).x;
      int old_head_y = snakeLoc.get(0).y;
      // 3. add a new head. The loc of the new head
      // depends on the direction of movement
      int new_head_x = old_head_x;
      int new_head_y = old_head_y;
      if (direction == 1) {
        // up
        new_head_y -= dotSize;
      } else if (direction == 2) {
        // down
        new_head_y += dotSize;
      } else if (direction == 3) {
        // left
        new_head_x -= dotSize;
      } else if (direction == 4) {
        // right
        new_head_x += dotSize;
      }
      snakeLoc.add(0, new Coordinate(new_head_x, new_head_y));

      // check whether the head overlaps with the apple
      if (snakeLoc.get(0).equals(appleLoc)) {
        // eating the apple.
        // Increase size by 1.
        // Added the removed tail back.
        snakeLoc.add(old_tail);

        // also need to regenerate the apple's location
        regenApple();
      }

      // Call repaint, which further invokes `paintComponent`.

    }


    public void regenApple () {
      int new_x = rnd.nextInt(40) * dotSize; // Random x-coordinate (0-39) * dotSize
      int new_y = rnd.nextInt(40) * dotSize; // Random y-coordinate (0-39) * dotSize
      appleLoc = new Coordinate(new_x, new_y);
    }


  }
