import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Password:");
    String pw = "coded";
    String attempt;
    attempt = input.nextLine();
    
    while (!attempt.equals(pw)) {
      System.out.println("Enter Password:");
      attempt = input.nextLine();
    }
    
    System.out.println("Access Granted!");
  }
}