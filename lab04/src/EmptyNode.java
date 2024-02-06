

/**
 * This represents an empty node in the list
 */
public class EmptyNode implements ListOfInts {

  @Override
  public ListOfInts prepend(int data){
    return new ElementNode(data,this);
  }

  @Override
  public ListOfInts append(int data){
    return new ElementNode(data,this);
  }

  @Override
  public ListOfInts insertAtIndex(int data,int index)throws IndexOutOfBoundsException{
    if (index!=0){
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    return new ElementNode(data,this);
  }

  @Override
  public int getDataAtIndex(int index) throws IndexOutOfBoundsException{
    throw new IndexOutOfBoundsException("Index out of bounds");
  }

  @Override
  public ListOfInts getRest() {
    return this;
  }

  @Override
  public int getCount(){
    return 0;
  }

  @Override
  public int getSum(){
    return 0;
  }

  @Override
  public String toString() {
    return "";
  }


}