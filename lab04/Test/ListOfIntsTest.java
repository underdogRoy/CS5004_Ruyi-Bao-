import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;


public class ListOfIntsTest {
  ListOfInts list =new EmptyNode();


  @Test
  public void prepend() {
    assertEquals("1 ",list.prepend(1).toString());
  }

  @Test
  public void append() {
    assertEquals("1 ",list.append(1).toString());
  }

  @Test
  public void insertAtIndex() {
    list=list.insertAtIndex(1,0);
    assertEquals("1 ",list.toString());
    list=list.append(2).append(3);
    list=list.insertAtIndex(4,1);
    assertEquals("1 4 2 3 ",list.toString());
    assertThrows(IndexOutOfBoundsException.class, ()-> list.insertAtIndex(5,5));

  }

  @Test
  public void getDataAtIndex() {
    list=list.prepend(1).prepend(2);
    assertEquals(2,list.getDataAtIndex(0));
  }

  @Test
  public void getRest() {
    list=list.prepend(1).prepend(2);
    ListOfInts rest=list.getRest();
    assertEquals("1 ",rest.toString());
  }

  @Test
  public void getCount() {
    assertEquals(0,list.getCount());
    list=list.prepend(1).prepend(2).prepend(3);
    assertEquals(3,list.getCount());
  }

  @Test
  public void getSum() {
    assertEquals(0,list.getSum());
    list=list.prepend(1).prepend(2).prepend(3);
    assertEquals(6,list.getSum());
  }
}