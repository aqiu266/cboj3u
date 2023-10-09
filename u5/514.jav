import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][][] arr = read3();
        System.out.println(size(arr));
    }

    public static int[][][] read3() {
        Scanner input = new Scanner(System.in);
        int f = input.nextInt(); // f for first "layer" of array
        int[][][] arr = new int[f][][];

        for (int i = 0; i < f; i++) {
            int c = 0;
            ArrayList<int[]> temp = new ArrayList<int[]>();
            
            while (true) {
                int it = input.nextInt();
              
                if (it == -1) {
                    break;
                } else {
                    int[] temp2 = new int[it];
                  
                    for (int j = 0; j < it; j++) {
                        temp2[j] = input.nextInt();
                    }
                    
                    temp.add(temp2);
                }

                c++;
            }

            arr[i] = new int[c][];

            for (int j = 0; j < c; j++) {
                int t = temp.get(j).length; // t for third "layer" of array
                arr[i][j] = new int[t];

                for (int k = 0; k < t; k++) {
                    arr[i][j][k] = temp.get(j)[k];
                }
            }
        }

        return arr;
    }

    public static int size(int[][][] arr) {
        int c = 0;
      
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                c += arr[i][j].length;
            }
        }

        return c;
    }
}