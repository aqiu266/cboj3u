import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter quadratic equation a, b and c");
    double a = inp.nextDouble();
    double b = inp.nextDouble();
    double c = inp.nextDouble();
    double delta = (b * b) - (4 * a * c);
    
    if (delta < 0) {
      System.out.println("This has no solution");
    } else if (delta == 0) {
      double ans = (-1 * b) / (2 * a);
      ans = Math.round(ans * 10.0) / 10.0;
      System.out.println("This has one solution x=" + ans);
    } else {
      double ans1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
      double ans2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
      ans1 = Math.round(ans1 * 10.0) / 10.0;
      ans2 = Math.round(ans2 * 10.0) / 10.0;

      if (ans1 > ans2) {
        System.out.println("This has two solutions x=" + ans2 + " and x=" + ans1);
      } else {
        System.out.println("This has two solutions x=" + ans1 + " and x=" + ans2);
      }
    }
  }
}