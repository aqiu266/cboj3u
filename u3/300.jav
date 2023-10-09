import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int guess;
    System.out.println("Enter your guess between 1 and 10:");
    guess = input.nextInt();
    while (guess < 1 || guess > 10) {
      System.out.println("Invalid guess");
      guess = input.nextInt();
    }
    
    System.out.println("Valid guess entered");
  }
}