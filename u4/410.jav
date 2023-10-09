import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt(), b = input.nextInt();
    System.out.println(gcd(a, b));
  }
  public static int gcd(int x, int y) {
    if (x == 0) {
      if (y == 0) {
        return 0;
      } else {
        return Math.abs(y);
      }
    } else if (y == 0) {
      return Math.abs(x);
    } else {
      while (x != y) {
        if (x > y) {
          x -= y;
        } else {
          y -= x;
        }
      }
    }
    return x;
  }
}