import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        int[][] da = new int[R][]; 

        for (int i = 0; i < R; i++) {
            int C = input.nextInt();
            da[i] = new int[C];
              
            for (int j = 0; j < C; j++) {
                da[i][j] = input.nextInt();
            }
        }

        System.out.println(max(da));
    }

    public static int max(int[][] arr) {
        int m = -2147483648;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (m < arr[i][j]) {
                    m = arr[i][j];
                }
            }
        }

        return m;
    }
}