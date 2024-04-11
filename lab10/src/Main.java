import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main {
  /**
   * Main method to start the Snake Game application.
   *
   * @param args Command-line arguments (not used).
   */
  public static void main(String[] args) {
    SnakeGameModel model = new SnakeGameModelImpl();
    SnakeGameView view = new SnakeGameViewImpl(model);
    SnakeGameController controller = new SnakeGameController(model,view);
    JFrame frame = new JFrame("Snake Game");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add((JPanel) view);
    frame.setSize(400, 400);
    frame.setVisible(true);

    Timer gameTimer = new Timer(200, e -> {
      // Update the game state
      model.moveSnake();




      // Refresh the view
      ((JPanel) view).repaint();
    });
    gameTimer.start();
  }
}
