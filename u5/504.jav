import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int[] occ = new int[11];
    int temp = input.nextInt();

    while (temp >= 0) {
      if (temp <= 10) {
        occ[temp] += 1;
      }

      temp = input.nextInt();
    }

    System.out.println("Score  #Occurrences");
    double m = 0, c = 0;
    
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + "      " + occ[i]);
      m += occ[i] * i;
      c += occ[i];
    }

    m = Math.round(10.0 * m / c) / 10.0;
    System.out.println("Mean: " + m);
  }
}