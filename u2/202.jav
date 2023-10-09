import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter first number:");
    int fir = inp.nextInt();
    System.out.println("Enter second number:");
    int sec = inp.nextInt();
    System.out.println("Enter third number:");
    int thir = inp.nextInt();

    if (fir > sec) {
      if (sec > thir) {
        System.out.println("The smallest number is: " + thir);
      } else {
        System.out.println("The smallest number is: " + sec);
      }
    } else {
      if (fir > thir) {
        System.out.println("The smallest number is: " + thir);
      } else {
        System.out.println("The smallest number is: " + fir);
      }
    }
  }
}