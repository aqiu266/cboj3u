import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int counter = 0;
      
    System.out.println("Simple Math Quiz");
    System.out.println();
    System.out.println("Question 1:");
    System.out.println("5+2 =");
    int fir = inp.nextInt();

    if (fir == 7) {
      System.out.println("Correct.");
      counter += 1;
    } else {
      System.out.println("Incorrect. 5+2 = 7");
    }

    System.out.println();
    System.out.println("Question 2:");
    System.out.println("3*6 = ");
    int sec = inp.nextInt();

    if (sec == 18) {
      System.out.println("Correct.");
      counter += 1;
    } else {
      System.out.println("Incorrect. 3*6 = 18");
    }

    System.out.println();
    System.out.println("Question 3:");
    System.out.println("88-3 =");
    int thir = inp.nextInt();

    if (thir == 85) {
      System.out.println("Correct.");
      counter += 1;
    } else {
      System.out.println("Incorrect. 88-3 = 85");
    }

    System.out.println();
    System.out.println("Score: " + counter + "/3");
  }
}