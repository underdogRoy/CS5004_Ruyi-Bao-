import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TicTacToeModelTest {
  private TicTacToeModel ticTacToeModel;
  ticTacToeModel=new TicTacToeModelImp();

  @Test
  public void move() {
    ticTacToeModel.move(0, 0);
    assertEquals(Player.X, ticTacToeModel.getMarkAt(0, 0));
    //Attempt to move to an already occupied position should throw an exception
    ticTacToeModel.move(1, 1);
    assertThrows(IllegalStateException.class, () -> ticTacToeModel.move(1, 1));

  }

  @Test
  public void nextPlayer() {
    ticTacToeModel.move(0, 0);
    assertEquals(Player.O, ticTacToeModel.nextPlayer());
    ticTacToeModel.move(1, 1); // Player X moves
    ticTacToeModel.move(0, 0); // Player O moves
    ticTacToeModel.move(1, 2); // Player X moves
    ticTacToeModel.move(0, 1); // Player O moves
    ticTacToeModel.move(1, 0); // Player X moves
    ticTacToeModel.move(2, 2); // Player O moves
    //After a game over, calling NextPlayer should throw an exception
    assertThrows(IllegalStateException.class, () -> ticTacToeModel.nextPlayer());
  }

  @Test
  public void getMarkAt() {
    assertNull(ticTacToeModel.getMarkAt(1, 2));
    //mark out of bounds should throw an exception
    assertThrows(IndexOutOfBoundsException.class, () -> ticTacToeModel.getMarkAt(4, 4));
  }

  @Test
  public void isGameOver() {
    //win
    ticTacToeModel.move(0, 0);
    ticTacToeModel.move(1, 0);
    ticTacToeModel.move(0, 1);
    ticTacToeModel.move(1, 1);
    ticTacToeModel.move(0, 2);
    assertTrue(ticTacToeModel.isGameOver());
    //tie
    ticTacToeModel.move(0, 0);
    ticTacToeModel.move(1, 0);
    ticTacToeModel.move(2, 0);
    ticTacToeModel.move(1, 1);
    ticTacToeModel.move(0, 1);
    ticTacToeModel.move(0, 2);
    ticTacToeModel.move(1, 2);
    ticTacToeModel.move(2, 2);
    assertTrue(ticTacToeModel.isGameOver());
  }

  @Test
  public void getWinner() {
    ticTacToeModel.move(0, 0);
    ticTacToeModel.move(1, 0);
    ticTacToeModel.move(0, 1);
    ticTacToeModel.move(1, 1);
    ticTacToeModel.move(0, 2);
    assertEquals(Player.X, ticTacToeModel.getWinner());
    //tie
    ticTacToeModel.move(0, 0);
    ticTacToeModel.move(1, 0);
    ticTacToeModel.move(2, 0);
    ticTacToeModel.move(1, 1);
    ticTacToeModel.move(0, 1);
    ticTacToeModel.move(0, 2);
    ticTacToeModel.move(1, 2);
    ticTacToeModel.move(2, 2);
    assertNull(ticTacToeModel.getWinner());
  }
}