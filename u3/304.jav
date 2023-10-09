import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sen = 0;
    int seq;
    seq = input.nextInt();
    int prev = 0, count = 0;
    
    while (seq != 0) {
      if (seq == prev) {
        count += 1;
      }
      
      prev = seq;
      seq = input.nextInt();
    }

    System.out.println("There are " + count + " cases of consecutive values");
  }
}