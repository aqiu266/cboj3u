import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        int C = input.nextInt();
        double[][] da = new double[R][C]; 

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                da[i][j] = input.nextDouble();
            }
        }

        System.out.println(sumArray(da));
    }

    public static int sumArray(double[][] arr) {
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                s += arr[i][j];
            }
        }

        return s;
    }
}