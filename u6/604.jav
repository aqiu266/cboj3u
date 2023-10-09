import java.util.*;

public class Main {
    public static void main(String[] args) {

        Fraction def = new Fraction();
        def.print();
        System.out.println("Default value check: " + def.equals(new Fraction(0, 1)));

        Fraction f1 = new Fraction(53, 54);
        f1.print();

        Fraction f2 = new Fraction(f1);
        f2.print();

        System.out.println("Assigned value check: " + f1.equals(f2));

    }
}

class Fraction {
    int num, den;

    public Fraction() {
        this.num = 0; this.den = 1;
    }
    
    public Fraction(int x, int y) {
        this.num = x; this.den = y;
    }
    
    public Fraction(Fraction f) {
        this.num = f.num; this.den = f.den;
    }
    
    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
    
    public boolean equals (Fraction other) {
        if (this.num == other.num && this.den == other.den) {
            return true;
        } else {
            return false;
        }
    }
}