import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Continue (y or n):");
    String res;
    res = input.nextLine();
    
    while (!res.equals("y") && !res.equals("n")) {
      System.out.println("Continue (y or n):");
      res = input.nextLine();
    }

    System.out.println("done");
  }
}