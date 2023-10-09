import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < n; i++) {
            String p = input.nextLine();
            int c = 0;
            String s = "";

            for (int j = 0; j < p.length(); j++) {
                if (Character.isDigit(p.charAt(j))) {
                    s += Character.toString(p.charAt(j));
                    c++;

                    if (c == 3 || c == 6) {
                      s += "-";
                    }
                } else if (Character.isLetter(p.charAt(j))) {
                    int ascii = p.charAt(j);

                    if (ascii < 68) {
                        s += "2";
                    } else if (ascii < 71) {
                        s += "3";
                    } else if (ascii < 74) {
                        s += "4";
                    } else if (ascii < 77) {
                        s += "5";
                    } else if (ascii < 80) {
                        s += "6";
                    } else if (ascii < 84) {
                        s += "7";
                    } else if (ascii < 87) {
                        s += "8";
                    } else {
                        s += "9";
                    }

                    c++;

                    if (c == 3 || c == 6) {
                      s += "-";
                    }
                } else {
                    ;
                }

                if (c == 10) {
                  break;
                }
            }

            System.out.println(s);
        }
    }
}