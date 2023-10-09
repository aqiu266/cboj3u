import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    char x = input.next().charAt(0);
    int y = input.nextInt();
    int z = input.nextInt();
    printRectHollow(x, y, z); 
   }
  public static void printRectHollow (char c, int width, int height) {
    if (width == 1) {
      for (int i = 0; i < height; i++) {
        System.out.println(Character.toString(c));
      }
    } else if (height == 1) {
      System.out.println((Character.toString(c)).repeat(width));
    } else {
      System.out.println((Character.toString(c)).repeat(width));
      for (int i = 2; i < height; i++) {
        System.out.println(Character.toString(c) + (" ".repeat(width - 2)) + Character.toString(c));
      }
      System.out.println((Character.toString(c)).repeat(width));
    }
  }
}