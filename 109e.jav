import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("Enter the radius:");
      double radius = inp.nextDouble();
      System.out.println("A = " + (3.14 * radius * radius * 10 / 10) + " units ^2");
      System.out.println("C = " + (6.28 * radius * 10 / 10) + " units");
    }
}