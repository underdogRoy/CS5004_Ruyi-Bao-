package book;

public class Person {
  String firstname;
  String lastname;
  int yearOfBirth;
  public String getFirstname(){
    return firstname;
  }
  public String getLastname(){
    return lastname;
  }
  public int getYearOfBirth(){
    return yearOfBirth;
  }
  public int getAge(){
    return 2024-yearOfBirth;
  }
}
