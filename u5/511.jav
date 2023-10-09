import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        int C = input.nextInt();
        int[][] da = new int[R][C]; 

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                da[i][j] = input.nextInt();
            }
        }

        for (int i = C - 1; i >= 0; i--) {
            for (int j = R - 1; j >= 0; j--) {
                System.out.print(da[j][i]);
            }

            System.out.print("\n");
        }
    }
}