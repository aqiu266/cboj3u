import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("Temp in F:");
      double fahr = inp.nextDouble();
      System.out.println("Temp in C:");
      System.out.println(Math.round((5.0 / 9) * (fahr - 32) * 10) / 10.0);
  }
}