import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Child child1 = new Child(s.nextInt(), s.nextDouble());
        Child child2 = new Child(s.nextInt(), s.nextDouble());
        Child child3 = new Child(s.nextInt(), s.nextDouble());
        System.out.println("Child 1 vs Child 2 - " + child1.equals(child2));
        System.out.println("Child 2 vs Child 3 - " + child2.equals(child3));
        System.out.println("Child 3 vs Child 1 - " + child3.equals(child1));

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }
}

class Child {
    private int height; // height in cm 
    private double mass; // mass in kg
    
    public Child(int x, double y) {
        height = x; mass = y;
    }

    public boolean equals(Child other) {
        if (Math.abs(this.height - other.height) <= 2 && Math.abs(this.mass - other.mass) <= 0.5) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        double bmi = mass * 10000.0 / (height * height);
        if (bmi > 18) {
            return "Child - good";
        } else {
            return "Child - bad";
        }
    }
}