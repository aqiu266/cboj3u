import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter 3 integer values:");
    int fir = inp.nextInt();
    int sec = inp.nextInt();
    int thir = inp.nextInt();

    if (fir > sec) {
      if (thir > fir) {
        System.out.println(sec + ", " + fir + ", " + thir);
      } else if (thir > sec) {
        System.out.println(sec + ", " + thir + ", " + fir);
      } else {
        System.out.println(thir + ", " + sec + ", " + fir);
      }
    } else {
      if (thir > sec) {
        System.out.println(fir + ", " + sec + ", " + thir);
      } else if (thir > fir) {
        System.out.println(fir + ", " + thir + ", " + sec);
      } else {
        System.out.println(thir + ", " + fir + ", " + sec);
      }
    }
  }
}