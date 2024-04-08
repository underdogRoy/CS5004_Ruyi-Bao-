import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeModelTest {
  private TicTacToeModel ticTacToeModel;
  @Before
  public void setup(){
    ticTacToeModel=new TicTacToeModelImp();
  }


  @Test
  public void testmovetypical() {
    ticTacToeModel.move(0, 0);
    assertEquals(Player.X, ticTacToeModel.getMarkAt(0, 0));
  }
  @Test
  public void testmoveexceptional() {
    //Attempt to move to an already occupied position should throw an exception
    ticTacToeModel.move(1, 1);
    assertThrows(IllegalStateException.class, () -> ticTacToeModel.move(1, 1));
  }

  @Test
  public void testnextPlayertypical() {
    //Player X moves first
    ticTacToeModel.move(0, 0);
    assertEquals(Player.O, ticTacToeModel.nextPlayer());

  }
  @Test
  public void testnextPlayerexceptional() {
    /*
     *    O   O
     *    X   X   X
     *            O
     */
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
  public void testgetMarkAttypical() {
    ticTacToeModel.move(1, 1); // Player X moves
    assertEquals(Player.X,ticTacToeModel.getMarkAt(1,1));
    assertNull(ticTacToeModel.getMarkAt(1, 2));

  }
  @Test
  public void testgetMarkAtexceptional() {
    //mark out of bounds should throw an exception
    assertThrows(IndexOutOfBoundsException.class, () -> ticTacToeModel.getMarkAt(4, 4));

  }

  @Test
  public void isGameOverwin() {

    //win
    /*
     *    O   O
     *    X   X   X
     *            O
     */
    assertFalse(ticTacToeModel.isGameOver());
    ticTacToeModel.move(1, 1); // Player X moves
    ticTacToeModel.move(0, 0); // Player O moves
    ticTacToeModel.move(1, 2); // Player X moves
    ticTacToeModel.move(0, 1); // Player O moves
    ticTacToeModel.move(1, 0); // Player X moves
    ticTacToeModel.move(2, 2); // Player O moves
    assertTrue(ticTacToeModel.isGameOver());

  }
  @Test
  public void isGameOvertie() {
    //tie
    /*
     *    X   X   O
     *    O   O   X
     *    X   X   O
     */
    assertFalse(ticTacToeModel.isGameOver());
    ticTacToeModel.move(0, 0);// Player X moves
    ticTacToeModel.move(1, 0);// Player O moves
    ticTacToeModel.move(2, 0);// Player X moves
    ticTacToeModel.move(1, 1);// Player O moves
    ticTacToeModel.move(0, 1);// Player X moves
    ticTacToeModel.move(0, 2);// Player O moves
    ticTacToeModel.move(1, 2);// Player X moves
    ticTacToeModel.move(2, 2);// Player O moves
    ticTacToeModel.move(2, 1);// Player X moves
    assertTrue(ticTacToeModel.isGameOver());
  }

  @Test
  public void getWinnertypical() {
    //player X win
    /*
     *    O   O
     *    X   X   X
     *            O
     */
    ticTacToeModel.move(1, 1); // Player X moves
    ticTacToeModel.move(0, 0); // Player O moves
    ticTacToeModel.move(1, 2); // Player X moves
    ticTacToeModel.move(0, 1); // Player O moves
    ticTacToeModel.move(1, 0); // Player X moves
    ticTacToeModel.move(2, 2); // Player O moves
    assertEquals(Player.X, ticTacToeModel.getWinner());

  }
  @Test
  public void getWinnernull() {
    //tie means no winner
    /*
     *    X   X   O
     *    O   O   X
     *    X   X   O
     */
    ticTacToeModel.move(0, 0);// Player X moves
    ticTacToeModel.move(1, 0);// Player O moves
    ticTacToeModel.move(2, 0);// Player X moves
    ticTacToeModel.move(1, 1);// Player O moves
    ticTacToeModel.move(0, 1);// Player X moves
    ticTacToeModel.move(0, 2);// Player O moves
    ticTacToeModel.move(1, 2);// Player X moves
    ticTacToeModel.move(2, 2);// Player O moves
    ticTacToeModel.move(2, 1);// Player X moves
    assertNull(ticTacToeModel.getWinner());
  }
}