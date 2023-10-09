import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      
      System.out.println("Enter first number:");
      int first = inp.nextInt();
      System.out.println("Enter second number:");
      int sec = inp.nextInt();

      if (first > sec) {
        System.out.println("Result: " + first + " is larger than " + sec);
      } else if (sec > first) {
        System.out.println("Result: " + sec + " is larger than " + first);
      } else {
        System.out.println("Result: The numbers are equal");
      }
  }
}