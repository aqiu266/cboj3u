import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();
    System.out.println(isLetter(line));
  }
  public static boolean isLetter(String x) {
    if (x.length() != 1) {
      return false;
    } else {
      return Character.isLetter((x).charAt(0));
    }
  }
}