import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
   public static void main (String[] args) { 
      dieRoll(); 
   }
  public static void dieRoll() { 
    System.out.println("You rolled a " + (1 + (int) (Math.random() * 6)));
  } 
}
// Scanner input = new Scanner(System.in);