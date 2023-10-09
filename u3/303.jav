import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a positive number (or negative number to quit):");
    double n;
    n = input.nextDouble();

    while (n >= 0) {
      System.out.println("Square root is: " + (Math.round(Math.sqrt(n) * 1000) / 1000.0));
      System.out.println();
      System.out.println("Enter a positive number (or negative number to quit):");
      n = input.nextDouble();
    }
  }
}