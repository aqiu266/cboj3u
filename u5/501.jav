import java.io.*;
import java.util.*;

/*
4
0
3
*/

import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int[] sample = new int[10];

    for (int i = 0; i < 10; i++) {
      sample[i] = input.nextInt();
    }

    int temp = sample[0];
    sample[0] = sample[9];
    sample[9] = temp;

    for (int i = 0; i < 10; i++) {
      if (sample[i] < 0) {
        sample[i] *= -1;
      }
    }

    int sampleSum = 0;

    for (int i = 0; i < 10; i++) {
      sampleSum += sample[i];
    }

    System.out.println(sampleSum);

    for (int i = 0; i < 8; i += 2) {
      System.out.print(sample[i] + " ");
    }

    System.out.println(sample[8] + "\n");
  }
}