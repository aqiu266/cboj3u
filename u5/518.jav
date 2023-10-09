import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = s.length(), len = 1;

        for (int i = 0; i < n; i++) {
            int j = 0;

            while (i >= j && (n - 1) > (i + j)) {
                if (s.charAt(i - j) == s.charAt(i + j + 1)) {
                    j++;
                } else {
                  break;
                }
            }

            if (2 * j > len) {
                len = 2 * j;
            }

            int k = 1;

            while (i >= k && n > (i + k)) {
                if (s.charAt(i - k) == s.charAt(i + k)) {
                    k++;
                } else {
                    break;
                }
            }

            if (2 * k - 1 > len) {
                len = 2 * k - 1;
            }
        }
    
    System.out.println(len);
    }
}