import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter integer 1:");
    int first = input.nextInt();
    System.out.println("Enter integer 2:");
    int sec = input.nextInt();
    System.out.println("Print asterisks:");
    System.out.println("*".repeat(Math.abs(first - sec)));
    System.out.println("Countdown seconds:");

    if (first > sec) {
      for (int i = first; i >= sec; i--) {
        System.out.println(i + " seconds");
      }
    } else {
      for (int i = sec; i >= first; i--) {
        System.out.println(i + " seconds");
      }
    }

    System.out.println("Enter a letter:");
    char fir = input.next().charAt(0);
    System.out.println("Enter a letter:");
    char second = input.next().charAt(0);

    for (int i = fir; i <= (int) second; i++) {
      System.out.println("Give me a " + ((char) i));
    }

    System.out.println("Output multiples - start at integer 1 and multiply by integer 2 stop when greater than 1000");
    int a = first;
    
    while (a <= 1000) {
      System.out.println(a);
      a *= sec;
    }
  }
}