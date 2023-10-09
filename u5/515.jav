import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        int a = 0, b = 0;

        for (int i = 0; i < v; i++) {
            if (s.charAt(i) == 'A') {
                a += 1;
            } else {
                b += 1;
            }
        }

        if (a > b) {
            System.out.println('A');
        } else if (b > a) {
            System.out.println('B');
        } else {
            System.out.println("Tie");
        }
    }
}