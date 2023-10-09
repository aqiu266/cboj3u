import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("Enter your mass:");
      double myMass = inp.nextDouble();
      System.out.println("Your mass is " + myMass + " kg.");  
    }
}