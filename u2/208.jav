import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter amount less than $1");
    int amount = inp.nextInt();
    System.out.println("Your change is:");

    if (amount > 24) {      
      if (amount > 49) {
        System.out.println(amount / 25 + " quarters");
        amount = amount % 25;
      } else {
        System.out.println("1 quarter");
        amount -= 25;
      }
    }

    if (amount > 9) {
      if (amount > 19) {
        System.out.println("2 dimes");
        amount -= 20;
      } else {
        System.out.println("1 dime");
        amount -= 10;
      }
    }

    if (amount > 4) {
      System.out.println("1 nickel");
      amount -= 5;
    }

    if (amount != 0) {
      if (amount == 1) {
        System.out.println("1 penny");
      } else {
        System.out.println(amount + " pennies");
      }
    }
  }
}