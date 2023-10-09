import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a letter:");
    char letter;
    letter = input.next().charAt(0);
    
    while (!Character.isLetter(letter)) {
      System.out.println("Not a letter. Enter a letter:");
      letter = input.next().charAt(0);
    }

    System.out.println("Done.");
  }
}