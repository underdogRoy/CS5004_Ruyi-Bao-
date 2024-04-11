import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * Interface for the Snake Game view.
 */
public interface SnakeGameView {
  /**
   * Paints the game components on the graphics context.
   *
   * @param g Graphics object to paint on.
   */
  void paintComponent(Graphics g);

}
