import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("Square Root\nInput a positive number:");
      int num1 = inp.nextInt();
      System.out.println("The square root of " + num1 + " is " + Math.sqrt(num1));
      System.out.println();
      System.out.println("****");
      System.out.println();
      System.out.println("Exponents");
      System.out.println("Input an integer:");
      int a = inp.nextInt();
      System.out.println("Input a second integer:");
      int b = inp.nextInt();
      System.out.println(a + " to the power of " + b + " is: " + Math.pow(a, b));
      System.out.println();
      System.out.println("****");
      System.out.println();
      System.out.println("Rounding, Ceiling and Floor\nInput a decimal value:");
      double dec = inp.nextDouble();
      System.out.println(dec + " rounds to " + Math.round(dec));
      System.out.println(dec + " ceiling is " + Math.ceil(dec));
      System.out.println(dec + " floor is " + Math.floor(dec));
      System.out.println();
      System.out.println("****");
      System.out.println();
      System.out.println("Random\nEnter the lower limit:");
      int lower = inp.nextInt();
      System.out.println("Enter the upper limit:");
      int upper = inp.nextInt();
      double rando = Math.floor((upper - lower) * Math.random() + lower);
      System.out.println("A random number between " + lower + " and " + upper + " is " + rando);
  }
}