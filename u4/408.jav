import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
    System.out.println(findLargest(a, b, c));
   }
  public static double findLargest(double x, double y, double z) {
    if (x > y) {
      if (x > z) {
        return x;
      } else {
        return z;
      }
    } else {
      if (y > z) {
        return y;
      } else {
        return z;
      }
    }
  }
}