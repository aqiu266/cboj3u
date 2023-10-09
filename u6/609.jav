import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Fraction p = new Fraction(s.nextInt(), s.nextInt());
        Fraction q = new Fraction(s.nextInt(), s.nextInt());
        Fraction.product(p, q).print(); // 1 
        Fraction.abs(q).print();        // 2

        System.out.println(Fraction.isPositive(p)); // 3
        System.out.println(Fraction.isPositive(q)); // 3

    }
}

class Fraction {
    private int num, den;
    
    public Fraction(int x, int y) {
        num = x; den = y;
    }

    public static Fraction product(Fraction f, Fraction g) {
        Fraction cur = new Fraction(f.num * g.num, f.den * g.den);
        boolean flag = true;

        if (cur.num < 0 && cur.den < 0) {
            cur.num *= -1; cur.den *= -1;
        }
        
        while (flag) {
            flag = false;
            for (int i = 2; i <= Math.min(Math.abs(cur.num), Math.abs(cur.den)); i++) {
                if (cur.num % i == 0 && cur.den % i == 0) {
                    flag = true;
                    cur.num /= i; cur.den /= i;
                    break;
                }
            }
        }
        
        return cur;
    }

    public static Fraction abs(Fraction f) {
        Fraction cur = new Fraction(f.num, f.den);
        if (cur.num < 0) {
            cur.num *= -1;
        }

        if (cur.den < 0) {
            cur.den *= -1;
        }

        boolean flag = true;
        
        while (flag) {
            flag = false;
            for (int i = 2; i <= Math.min(Math.abs(cur.num), Math.abs(cur.den)); i++) {
                if (cur.num % i == 0 && cur.den % i == 0) {
                    flag = true;
                    cur.num /= i; cur.den /= i;
                    break;
                }
            }
        }

        return cur;
    }

    public static boolean isPositive(Fraction f) {
        if (f.num * f.den > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
}