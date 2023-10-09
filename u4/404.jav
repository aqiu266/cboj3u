import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt(); 
    printRollDice(a); 
   }
  public static void printRollDice(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("Roll " + i + " is a " + (1 + (int) (Math.random() * 6)));
    }
  } 
}