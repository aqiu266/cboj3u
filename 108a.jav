import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int l;
      int w;
      int area;
      System.out.println("Welcome to my Area Program!");
      Scanner inp = new Scanner(System.in);
      System.out.println("Enter the length:");
      l = inp.nextInt();
      System.out.println("Enter the width:");
      w = inp.nextInt();
      
      area = l * w;
      System.out.println("Area = " + area);
      
    }
}