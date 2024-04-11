import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
/**
 * Controller class handling user input for the Snake Game.
 */
public class SnakeGameController implements KeyListener {
  private SnakeGameModel model;
  private SnakeGameView view;

  private int direction;

  public SnakeGameController(SnakeGameModel model,SnakeGameView view) {
    this.model = model;
    this.view= view;
    ((JPanel)view).setFocusable(true);
    ((JPanel)view).addKeyListener(this);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    // Do nothing
  }

  @Override
  public void keyPressed(KeyEvent e) {
    int keyCode = e.getKeyCode();
    if (keyCode == KeyEvent.VK_UP) {
      // up key is pressed
      direction = 1;
    } else if (keyCode == KeyEvent.VK_DOWN) {
      // down
      direction = 2;
    } else if (keyCode == KeyEvent.VK_LEFT) {
      // left
      direction = 3;
    } else if (keyCode == KeyEvent.VK_RIGHT) {
      // right
      direction = 4;
    }
    model.setDirection(direction);

    if (model.getSnakeLoc().get(0).equals(model.getAppleLoc())) {
      model.moveSnake();

    }

    // Refresh the view
    ((JPanel) view).repaint();
  }
  /**
   * KeyListener method for handling key released event.
   * @param e KeyEvent object representing the key released event.
   */
  @Override
  public void keyReleased(KeyEvent e) {
    // do nothing
  }



}
