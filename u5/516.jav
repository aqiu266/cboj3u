import java.io.*;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String s1 = input.nextLine(), s2 = input.nextLine();
        String[] a1 = s1.split("\\s+"), a2 = s2.split("\\s+");
        HashMap<String, String> pair = new HashMap<String, String>();
        
        if (n % 2 == 1) {
            System.out.println("bad");
        } else {
            boolean flag = false;
            
            for (int i = 0; i < n; i++) {
                if (a1[i].equals(a2[i])) {
                    System.out.println("bad");
                    flag = true;
                    break;
                }
                
                pair.put(a1[i], a2[i]);
            }
            
            if (!flag) {
                for (int i = 0; i < n; i++) {
                    if (!a1[i].equals(pair.get(pair.get(a1[i])))) {
                        System.out.println("bad");
                        break;
                    }
                    
                    if (i == n - 1) {
                        System.out.println("good");
                    }
                }
            }
        }
    }
}