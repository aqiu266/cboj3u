import java.util.Scanner;

public class Main {
    //DO NOT ALTER THE MAIN --- Add your Fraction class
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        Fraction a = new Fraction( );
        Fraction b = new Fraction( );
        Fraction c = new Fraction( );
        Fraction d = new Fraction( );

       //set fractions with user input
       a.num = s.nextInt();
       a.den = s.nextInt();
       b.num = s.nextInt();
       b.den = s.nextInt();
       c.num = s.nextInt();
       c.den = s.nextInt();

       //call instance methods
        a.plusEquals(b);
        d = a.plus(c);
        d.reduce();

       //print fractions with instance method
        a.print();
        b.print();
        c.print();
        d.print();

    }
}

class Fraction {
    int num, den;

    public void plusEquals(Fraction other) {
        this.num = this.num * other.den + other.num * this.den;
        this.den *= other.den;
    }

    public Fraction plus(Fraction other) {
        Fraction temp = new Fraction();
        temp.num = this.num * other.den + other.num * this.den;
        temp.den = this.den * other.den;
        return temp;
    }

    public void reduce() {
        for (int i = Math.min(this.num, this.den); i > 1; i--) {
            if (this.num % i == 0 && this.den % i == 0) {
                this.num /= i;
                this.den /= i;
                break;
            }
        }
    }
    
    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
}