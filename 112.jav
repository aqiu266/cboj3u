import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("Enter first number:");
      double numero = inp.nextDouble();
      System.out.println("Number of decimal places:");
      int places = inp.nextInt();
      double outfin = Math.round(numero * Math.pow(10, places)) / (Math.pow(10, places));
      System.out.println(outfin);
  }
}