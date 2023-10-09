import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    char x = input.next().charAt(0);
    int y = input.nextInt();
    int z = input.nextInt();
    printRect(x, y, z); 
   }
  public static void printRect (char c, int width, int height) {
    for (int i = 0; i < height; i++) {
      System.out.println((Character.toString(c)).repeat(width));
    }
  } 
}