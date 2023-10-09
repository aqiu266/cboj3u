import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("Enter cents:");
      int cents = inp.nextInt();
      int quart = cents / 25;
      int dime = (cents % 25) / 10;
      int nick = ((cents % 25) % 10) / 5;
      int penn = (((cents % 25) % 10) % 5);
      System.out.println("Quarters " + quart + ", dimes " + dime + ", nickels " + nick + ", pennies " + penn);
  }
}