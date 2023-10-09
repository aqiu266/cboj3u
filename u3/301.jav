import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a sentinel value:");
    int sen = input.nextInt();
    System.out.println("Enter an integer:");
    int enter;
    enter = input.nextInt();

    while (sen != enter) {
      System.out.println("Enter an integer:");
      enter = input.nextInt();
    }

    System.out.println("Stop");
  }
}