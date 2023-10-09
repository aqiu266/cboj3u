import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("Enter mark 1:");
      double mark1 = inp.nextDouble();
      System.out.println("Marks: " + mark1);
      System.out.println("Enter mark 2:");
      double mark2 = inp.nextDouble();
      System.out.println("Marks: " + mark1 + ", " + mark2);
      System.out.println("Mark total is " + (mark1 + mark2));
      System.out.println("Enter mark 3:");
      double mark3 = inp.nextDouble();
      System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
      System.out.println("Mark total is " + (mark1 + mark2 + mark3));
      System.out.println("Enter mark 4:");
      double mark4 = inp.nextDouble();
      System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3 + ", " + mark4);
      System.out.println("Mark total is " + (mark1 + mark2 + mark3 + mark4));
      System.out.println("The average is " + (mark1 + mark2 + mark3 + mark4) / 4);
    }
}