import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char oc = input.nextLine().charAt(0);
        char nc = input.nextLine().charAt(0);
        String s = input.nextLine();
        System.out.println(replace(s, oc, nc));
    }
    
    public static String replace (String s, char oldChar, char newChar)
 {
        Boolean sec = false;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == oldChar) {
                sec = !sec;

                if (!sec) {
                    s = s.substring(0, i) + Character.toString(newChar) + s.substring(i + 1, s.length());
                }
            }
        }
   
        return s;
    }
}