import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), d = input.nextInt();
    randomNumber();
    randomNumber(a);
    randomNumber(b, c);
    randomNumber(b, c, d);
   }
  public static void randomNumber() {
    System.out.println(1 + (int) (Math.random() * 6));
  }
  public static void randomNumber(int x) {
    System.out.println(1 + (int) (Math.random()) * x);
  }
  public static void randomNumber(int mi, int ma) {
    System.out.println(mi + (int) (Math.random() * (ma - mi + 1)));
  }
  public static void randomNumber(int mi, int ma, int s) {
    int range = (int) (Math.random() * (ma - mi + 1));
    System.out.println(range - range % s + mi);
  }
}