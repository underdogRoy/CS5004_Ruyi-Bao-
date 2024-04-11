

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
 * Implementation of the SnakeGameView interface using Swing JPanel.
 */
public class SnakeGameViewImpl extends JPanel implements SnakeGameView {


  private SnakeGameModel model;

  private Image appleImage;
  private Image snakeHeadImage;
  private Image snakeBodyImage;


  public SnakeGameViewImpl(SnakeGameModel model) {
    this.model=model;
    loadImage();
  }

  private void loadImage() {
    try {
      appleImage = ImageIO.read(new URL("https://cdn-uploads.piazza.com/paste/k53ka6172ie4ll/10addac51ca9ba16a3cc46fcb64ca250e5fb15c58c78530c2096bf2e4b503b7b/apple.png"));
      snakeHeadImage = ImageIO.read(new URL("https://cdn-uploads.piazza.com/paste/k53ka6172ie4ll/32956f1c46253cf2ebb9a9c6519df3116fe8c4ca7167444c1312168fbb96873c/head.png"));
      snakeBodyImage = ImageIO.read(new URL("https://cdn-uploads.piazza.com/paste/k53ka6172ie4ll/08b035cfbd798f6bb0e0f7eb680979285a2df1d51f9066d53707a4a0f79f88ac/dot.png"));
    } catch (Exception e) {
      System.out.println("Failed to load images");
    }
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.drawImage(appleImage, model.getAppleLoc().getX(), model.getAppleLoc().getY(), this);

    for (int i = 0; i < model.getSnakeLoc().size(); i++) {
      Coordinate part = model.getSnakeLoc().get(i);
      if (i == 0) {
        g.drawImage(snakeHeadImage, part.getX(), part.getY(), this);
      } else {
        g.drawImage(snakeBodyImage, part.getX(), part.getY(), this);
      }
    }
  }
}
