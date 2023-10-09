import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      System.out.println("Enter four course grades:");
      Scanner inp = new Scanner(System.in);
      double average = 0;
      
      for (int i = 0; i < 4; i++) {
        average += inp.nextDouble();
      }

      System.out.println("The average is: " + average / 4);
    }
}