import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PetRockTest {
  private PetRock rocky;
  @Rule
  public Timeout globalTimeout=Timeout.seconds(10);
  @Before
  public void myTestSetUp()throws Exception{
    rocky=new PetRock("Rocky",100.0);
  }
  @Test
  public void getName() throws Exception {

    assertEquals("Rocky",rocky.getName());
  }
  @Test
  public void testUnhapppyToStart() throws Exception{

    assertFalse(rocky.isHappy());
  }

  @Test
  public void testmass()throws Exception {
    PetRock rocky2=new PetRock("Rocky2",100.0);
    assertSame(rocky.getMass(),rocky2.getMass());
  }

  @Test
  public void testHappyAfterPlay() throws Exception {
    rocky.PlayWithRock();
    assertTrue(rocky.isHappy());

  }


  @Test(expected=IllegalStateException.class)
  public void nameFail()  throws Exception{
    rocky.getHappyMessage();
  }

  @Test
  public void testFavNum()throws Exception {
    assertEquals(7,rocky.getFavNumber());
  }

  @Test (expected = IllegalArgumentException.class)
  public void emptyNameFail()throws Exception {
    new PetRock("",100.0);
  }

  @Test
  public void name() throws Exception {
    rocky.PlayWithRock();
    String msg = rocky.getHappyMessage();
    assertEquals("I'm happy!",msg);
  
  }

  @Test (timeout = 100)
  public void waitForHappyTimeout()throws Exception {
    rocky.waitTillHappy();
  }

  @Test
  public void testtoString() {
    assertEquals("PetRock{name=Rocky,happy=false,mass=100.0}",rocky.toString());
  }
}