
/**
 * This represents an non-empty node in the list
 */
public class ElementNode implements ListOfInts {
  private int data;
  private ListOfInts rest;
  public ElementNode(int data, ListOfInts rest){
    this.data=data;
    this.rest=rest;
  }

  @Override
  public ListOfInts prepend(int data){
    return new ElementNode(data,this);
  }

  @Override
  public ListOfInts append(int data){
    return new ElementNode(this.data,rest.append(data));
  }

  @Override
  public ListOfInts insertAtIndex(int data,int index)throws IndexOutOfBoundsException{
    if (index==0){
      return new ElementNode(data,this);
    }else {
      return new ElementNode(this.data, rest.insertAtIndex(data, index - 1));
    }
  }

  @Override
  public int getDataAtIndex(int index) throws IndexOutOfBoundsException{
    if (index==0){
      return data;
    }else {
      return rest.getDataAtIndex(index-1);
    }

  }

  @Override
  public ListOfInts getRest() {
    return rest;
  }

  @Override
  public int getCount(){
    return 1+rest.getCount();
  }

  @Override
  public int getSum(){
    return data+ rest.getSum();
  }

  @Override
  public String toString() {
    return data+" "+rest.toString();
  }


}