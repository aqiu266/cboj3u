import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = Character.toLowerCase(input.nextLine().charAt(0));
        String s = input.nextLine().toLowerCase();
        System.out.println(count(c, s));
    }
    
    public static int count (char c, String s) {
        int o = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                o++;
            }
        }
        
        return o;
    }
}