import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main (String[] args) { 
      twoDieRoll(); 
   }
  public static void twoDieRoll() {
    int a = 1 + (int) (Math.random() * 6);
    int b = 1 + (int) (Math.random() * 6);
    System.out.println(a + " and " + b + " ==> total " + (a + b));
  } 
}
// Scanner input = new Scanner(System.in);