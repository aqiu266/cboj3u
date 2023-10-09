import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter first num:");
    int fir = inp.nextInt();
    System.out.println("Enter second num:");
    int sec = inp.nextInt();
    System.out.println("What is " + fir + " mod " + sec + "?");
    int ans = inp.nextInt();

    if (ans == fir % sec) {
      System.out.println("Congrats - correct.");
    } else {
      System.out.println("Incorrect.\nModulus returns the remainder.");
      System.out.println(sec + " divides into " + fir + ", " + (fir / sec) + " times and there is " + (fir % sec) + " leftover.");
      System.out.println(fir + " mod " + sec + " is " + (fir % sec) + ".");
    }
  }
}