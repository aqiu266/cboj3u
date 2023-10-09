import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("numerator=");
      int up = inp.nextInt();
      System.out.println("denominator=");
      int down = inp.nextInt();
      System.out.println(up + " / " + down + " is equivalent to " + up / down + " and " + up % down + " / " + down);
  }
}