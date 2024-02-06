package class02.src;

import java.util.Scanner;



import java.util.Scanner;



public class Grade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Student student = new Student();

    System.out.print("Please Enter Your Student ID:");
    student.ID = scanner.nextInt();
    System.out.print("Please Enter Your First Name:");
    student.firstName = scanner.next();
    System.out.print("Please Enter Your Last Name:");
    student.lastName = scanner.next();

    do {
      System.out.println("Please Enter Your Grade for Quiz 1 and 2 (Out of 10 Points for Each Quiz):");
      student.quiz1 = scanner.nextDouble();
      student.quiz2 = scanner.nextDouble();
    } while (student.quiz1 > 10 || student.quiz2 > 10);

    System.out.println("Please Enter Your Grade for Midterm (Out of 100):");
    student.midterm = scanner.nextDouble();
    System.out.println("Please Enter Your Grade for Final Exam (Out of 100):");
    student.finalExam = scanner.nextDouble();

    double finalQuiz = calcQuiz(student.quiz1, student.quiz2);
    double totalMidFin = calcMidFin(student.midterm, student.finalExam);
    double gradeAverage = finalQuiz + totalMidFin;
    int finalGrade = (int) (gradeAverage * 100);
    char letterGrade = letterGrade(finalGrade);

    System.out.println("Your Student Information is:");
    System.out.println("ID: " + student.ID);
    System.out.println("Name: " + student.firstName + " " + student.lastName);
    System.out.println("Quiz 1: " + student.quiz1);
    System.out.println("Quiz 2: " + student.quiz2);
    System.out.println("Midterm: " + student.midterm);
    System.out.println("Final: " + student.finalExam);
    System.out.println("Your Numerical Grade Is: " + finalGrade);
    System.out.println("Your Letter Grade Is: " + letterGrade);

    scanner.close();
  }

  static double calcQuiz(double q1, double q2) {
    double newQuiz1 = q1 * 10;
    double newQuiz2 = q2 * 10;
    double sum = newQuiz1 + newQuiz2;
    double quizAverage = sum / 2;
    return quizAverage * 0.25;
  }

  static double calcMidFin(double mid, double fin) {
    double midGrade = mid * 0.25;
    double finGrade = fin * 0.5;
    return midGrade + finGrade;
  }

  static char letterGrade(int finGrade) {
    if (finGrade >= 90)
      return 'A';
    else if (finGrade >= 80 && finGrade < 90)
      return 'B';
    else if (finGrade >= 70 && finGrade < 80)
      return 'C';
    else if (finGrade >= 60 && finGrade < 70)
      return 'D';
    else
      return 'F';
  }
}