import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Objects;

public class Handimp<C> implements Hand<C>{
  private ArrayList<C> cards;
  public Handimp(){
    this.cards=new ArrayList<>();
  }


  @Override
  public Hand<C> emptyHand() {
    return new Handimp<>();
  }

  @Override
  public void add(C card) {
    cards.add(0,card);

  }

  @Override
  public void discard(int index) {
    if (index>=0&&index< cards.size()){
      cards.remove(index);
    }

  }

  @Override
  public C get(int index) {
    if (index>=0&&index< cards.size()){
      return cards.get(index);
    }
    throw new IllegalArgumentException("Index out of range");
  }

  @Override
  public int getSize() {
    return cards.size();
  }

  @Override
  public boolean isEmpty() {
    return cards.isEmpty();
  }

  @Override
  public int find(C card) {
    return cards.indexOf(card);
  }

  @Override
  public void sortHand(Comparator<C> comparator) {
    Collections.sort(cards,comparator);

  }

  @Override
  public Hand<C> getHand(Predicate<C> predicate) {
    Hand<C> result=new Handimp<>();
    for(C card:cards){
      if(predicate.test(card)){
        result.add(card);
      }
    }
    return result;
  }

  @Override
  public int rankSum() {
    /*int sum=0;
    for (C card:cards){
      sum+=((Card)card).getRank();
    }
    return sum;*/
    return cards.stream().mapToInt(card -> ((Card)card).getRank()).sum();
  }

  @Override
  public <R> Hand<R> getMap(Function<C, R> converter) {
    Hand<R> mappedHand=  new Handimp<>();
    for (C card:cards){
      R mappedValue=converter.apply(card);
      mappedHand.add(mappedValue);
    }

    return mappedHand;
  }
}
