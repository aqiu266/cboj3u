import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[4];
        
        for (int i = 0; i < 4; i++) {
            if (i != 0) {
                input.nextLine();
            }
            
            students[i] = new Student();
            students[i].fname = input.nextLine();
            students[i].lname = input.nextLine();
            students[i].age = input.nextInt();
            students[i].grade = input.nextInt();
        }

        System.out.println(students[0].fname);
        System.out.println(students[1].lname);
        System.out.println(students[2].age);
        System.out.println(students[3].grade);
    }
}

class Student {
    String fname, lname;
    int age, grade;
}