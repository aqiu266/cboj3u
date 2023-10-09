import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("Please enter a positive, 4-digit number (1111 to 9999):");
      int nombre = inp.nextInt();
      int thous = nombre / 1000;
      int hunds = (nombre - thous * 1000) / 100;
      int tens = (nombre - thous * 1000 - hunds * 100) / 10;
      int ones = nombre - thous * 1000 - hunds * 100 - tens * 10;
      System.out.println("The digits of " + nombre + " are " + thous + ", " + hunds + ", " + tens + ", and " + ones + ".");
  }
}