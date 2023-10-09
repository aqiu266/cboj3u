import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       //read in integer values
       int [] nums = new int[4];
       int [] dens = new int[4];
       for (int i=0; i<4; i++){
         nums[i] = s.nextInt();
         dens[i] = s.nextInt();
       }
        //set fractions with user input
        Fraction a = new Fraction(nums[0],dens[0] );
        Fraction b = new Fraction(nums[1],dens[1] );
        Fraction c = new Fraction( );
        Fraction d = new Fraction( );

       //call getters/setters 
        System.out.println(a.getNumerator());
        System.out.println(a.getDenominator());
        System.out.println(b.getNumerator());
        System.out.println(b.getDenominator());

        c.setNumerator(nums[2]);
        c.setDenominator(dens[2]);
        d.setNumerator(nums[3]);
        d.setDenominator(dens[3]);

        d.invert();
       //print fractions
        a.print();
        b.print();
        c.print();
        d.print();

    }

}


class Fraction {
    private int num;
    private int den;
    
    public Fraction() {
        this.num = 0; this.den = 1;
    }

    public Fraction(int x, int y) {
        if (y < 0) {
            this.num = -x; this.den = -y;
        } else if (y == 0) {
            this.num = x; this.den = 1;
        } else {
            this.num = x; this.den = y;
        }
    }
    
    public int getNumerator() {
        return this.num;
    }

    public int getDenominator() {
        return this.den;
    }

    public void setNumerator(int n) {
        this.num = n;
    }

    public void setDenominator(int d) {
        if (d < 0) {
            this.den = -d;
            this.num *= -1;
        } else if (d == 0) {
            this.den = 1;
        } else {
            this.den = d;
        }
    }

    public void invert() {
        int temp = this.num;
        this.num = this.den;
        this.den = temp;

        if (this.den < 0) {
            this.num *= -1;
            this.den *= -1;
        } else if (this.den == 0) {
            this.den = 1;
        }
    }
    
    public void print() {
        System.out.println(this.num + "/" + this.den);
    }
}