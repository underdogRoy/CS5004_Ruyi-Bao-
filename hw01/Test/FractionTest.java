import static org.junit.Assert.*;
import org.junit.Test;

public class FractionTest {

  @Test
  public void getNumeratorandgetDenominator() {
    Fraction newfraction=new FractionImpl(1,2);
    assertEquals(1,newfraction.getNumerator());
    assertEquals(2,newfraction.getDenominator());
  }

  @Test
  public void setNumerator() {
  }

  @Test
  public void setDenominator() {
  }

  @Test
  public void testtoDouble() {
    Fraction newfraction=new FractionImpl(1,2);
    assertEquals(0.5,newfraction.toDouble());
  }

  @Test
  public void testToString() {
    Fraction newfraction=new FractionImpl(2,4);
    assertEquals("1/2",newfraction.toString());
  }

  @Test
  public void reciprocal() {
    Fraction newfraction=new FractionImpl(2,3);
    assertEquals("3/2",newfraction.reciprocal().toString());
  }

  @Test
  public void add() {
    Fraction newfraction1=new FractionImpl(1,2);
    Fraction newfraction2=new FractionImpl(1,4);
    Fraction result=newfraction1.add(newfraction2);
    assertEquals(3,result.getNumerator());
    assertEquals(4,result.getDenominator());
  }

  @Test
  public void compareTo() {
    Fraction newfraction1=new FractionImpl(1,2);
    Fraction newfraction2=new FractionImpl(1,4);
    assertTrue(newfraction1.compareTo(newfraction2)>0);
  }
}