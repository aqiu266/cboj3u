import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int pos;
    pos = input.nextInt();
    
    while (pos < 1) {
      System.out.println("Enter a positive integer:");
      pos = input.nextInt();
    }
    
    int sum = 0, image = pos;
    
    for (int i = (int) Math.floor(Math.log10(pos)); i > -1; i--) {
      sum += image / (Math.pow(10, i));
      image %= Math.pow(10, i);
    }

    System.out.println("Sum of " + pos + "\'s digits is " + sum);
  }
}