import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.println("Where were you born? Enter a string value:");
      String loc = inp.nextLine();
      System.out.println("What is your middle initial? Enter a character:");
      char init = inp.nextLine().charAt(0);
      System.out.println("What year were you born? Enter the 4 digit integer value:");
      int year = inp.nextInt();
      System.out.println("Pick a number between 16 and 17. Enter the decimal number:");
      double numb = inp.nextDouble();
      String con = "Colonel By";
      System.out.println("Thank you for your input.");
      System.out.println(loc + " is beautiful.");
      System.out.println(init + ", can I call you, \"" + init + "\" - I think you must be " + year + " + " + numb + " years old and attend \"" + con + "\".");
  }
}