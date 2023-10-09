import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fraction f1 = new Fraction(), f2 = new Fraction();
        f1.num = input.nextInt();
        f1.den = input.nextInt();
        f2.num = input.nextInt();
        f2.den = input.nextInt();
        f1.num *= 2;
        System.out.println(f1.num + "/" + f1.den);
        int temp = f2.num;
        f2.num = f2.den;
        f2.den = temp;
        System.out.println(f2.num + "/" + f2.den);
        f1.num *= f2.num;
        f1.den *= f2.den;
        System.out.println(f1.num + "/" + f1.den);
        f2.num = f1.num * f2.den + f1.den * f2.num;
        f2.den *= f1.den;
        System.out.println(f2.num + "/" + f2.den);
        f1.num = Math.abs(f1.num);
        f1.den = Math.abs(f1.den);
        System.out.println(f1.num + "/" + f1.den);
    }
}

class Fraction {
    int num, den;
}

// Q2: p must be initialized as the statement "Fraction p;" only creates a reference to a fraction, not an actual instance of a fraction. The statement "p = new Fraction();" is required to create an instance.
// Q3: p is the fraction 1/3, q is the fraction 4/3, and r is also the fraction 4/3.