import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter age:");
    int age = inp.nextInt();

    if (age < 12) {
      System.out.println("You are a child");
    } else if (age < 20) {
      System.out.println("You are a teen");
    } else if (age < 66) {
      System.out.println("You are an adult");
    } else {
      System.out.println("You are a senior citizen");
    }
  }
}