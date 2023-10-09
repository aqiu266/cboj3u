import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter N:");
    int n;
    n = input.nextInt();

    while (n < 1) {
      System.out.println("Invalid input.");
      System.out.println("Enter N:");
      n = input.nextInt();
    }

    System.out.println("The sum of the first " + n + " integers is " + (n * (n + 1) / 2));
  }
}