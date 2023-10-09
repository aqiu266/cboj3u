import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt(), b = input.nextInt();
    System.out.println(isDivisible(a, b));
   }
  public static boolean isDivisible(int x, int y) {
    return (x % y == 0);
  }
}