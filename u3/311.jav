import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a = 0, b = 0, e = 0;
    long c = 1;
    int d = 0;
    
    for (int i = 1; i <= 1000; i++) {
      a += (1.0 / i);
    }
    
    for (int i = 1; i <= 50; i++) {
      b += Math.sqrt(i * 100);
    }

    for (int i = 1; i <= 20; i++) {
      c *= i;
    }

    for (int i = -12; i <= 20; i++) {
      d += Math.pow(i, 3);
    }

    for (int i = 1; i <= 25; i++) {
      e += Math.pow(i, 1.0 / i);
    }

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
}