import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt(), m = input.nextInt();
        int[] arr = new int[k];
      
        for (int i = 0; i < k; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int r = input.nextInt(), c = 0;
            int[] temp = new int[arr.length - arr.length / r];

            for (int j = 0; j < arr.length; j++) {
                if ((j + 1) % r != 0) {
                    temp[c] = arr[j];
                    c++;
                }
            }

            arr = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}