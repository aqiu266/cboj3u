import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = input.nextLine(), s2 = input.nextLine(), s3 = input.nextLine();
    String out = "";
    out += Character.toString(s1.toUpperCase().charAt(0)) + Character.toString(s2.toUpperCase().charAt(0)) + Character.toString(s3.toUpperCase().charAt(0));
    out += Integer.toString(Math.abs(s1.length() - s2.length()));

    if (s1.indexOf("a") % 2 == 0 && s1.indexOf("a") < 10) {
      out += Integer.toString(s1.indexOf("a"));
    } else {
      out += "#";
    }

    String s4 = s3.replaceAll("\\s","");

    if (s4.length() <= 3) {
      out += s4 + "%".repeat(3 - s4.length());
    } else {
      out += s4.substring(s4.length() - 3, s4.length()).toLowerCase();
    }

    System.out.println(out);
  }
}