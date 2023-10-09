import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String txt = input.nextLine();
    txt = txt.toLowerCase();
    txt = txt.replaceAll("\\s+", "");
    boolean flag = false;
    int n = txt.length();
    
    for (int i = 0; i <= Math.ceil(n / 2.0) - 1; i++) {
      if (txt.charAt(i) != (txt.charAt(n - i - 1))) {
        flag = true;
        break;
      }
    }

    if (flag) {
      System.out.println(false);
    } else {
      System.out.println(true);
    }
  }
}