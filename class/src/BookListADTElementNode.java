package src;

import bookutil.Book;

/**
 * This class represents an element node in the list adt implementation.
 */
public class BookListADTElementNode implements listadt.BookListADTNode {
  private Book book;
  private listadt.BookListADTNode rest;

  public BookListADTElementNode(Book p, listadt.BookListADTNode rest) {
    this.book = p;
    this.rest = rest;
  }

  @Override
  public int count() { return 1+this.rest.count();}

  @Override
  public listadt.BookListADTNode addFront(Book book) {
    return new BookListADTElementNode(book,this);
  }

  @Override
  public listadt.BookListADTNode addBack(Book book) {
    this.rest = this.rest.addBack(book);
    return this;
  }

  @Override
  public listadt.BookListADTNode add(int index,Book book) {
    if (index==0) {
      return addFront(book);
    }
    else {
      this.rest = this.rest.add(index-1,book);
      return this;
    }
  }

  @Override
  public listadt.BookListADTNode remove(Book book) {
    if (this.book.equals(book)) {
      return this.rest;
    }
    else {
      this.rest = this.rest.remove(book);
      return this;
    }
  }

  @Override
  public Book get(int index) throws IllegalArgumentException{
    if (index==0) return this.book;
    return this.rest.get(index-1);
  }

  @Override
  public String toString() {
    return "("+this.book.toString()+")"+this.rest.toString();
  }
}