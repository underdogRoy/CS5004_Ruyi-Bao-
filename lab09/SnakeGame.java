import java.awt.Dimension;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * This class represents a simple Snake Game.
 * It includes a graphical interface with a snake that moves around the screen and eats apples.
 * The game's logic and rendering are contained within this class.
 */
public class SnakeGame {
  /**
   * The main method of the game. It initializes the JFrame and starts the game.
   * @param args Command line arguments (not used).
   */
  //improvement comments:Separate the game logic from the GUI code to follow a more modular structure,
  // possibly adhering to the MVC (Model-View-Controller) pattern.
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JPanel panel = new MyPanel();
    panel.setPreferredSize(new Dimension(400, 400));
    frame.add(panel);
    frame.pack();
    // by default, everything is invisible. Make it visible
    frame.setVisible(true);
  }
}
