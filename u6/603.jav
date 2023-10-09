import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create random students 
        String [] names = {"Adam", "Bert", "Cansu", "David", "Ernie"};
        int [] ages = {12, 13, 14, 15, 16};
        String [] addresses = {"123 Happy Lane, Ottawa, ON", "45 Colonel By Dr, Ottawa, ON", "32 Abc Dr, Ottawa, ON"};
        String [] phones = {"613-555-3333", "613-555-3333", "613-555-2312"};


        Student [] students = new Student[4];

        for(int i = 0; i < 3; i++){
            students[i] = new Student();
            students[i].name = names[i];
            students[i].age = ages[i];
            students[i].address = addresses[i];
            students[i].phone = phones[i];
            students[i].email = "enter";
            students[i].setStudentPassword();
        }

        // Set student 0 email info
        students[0].email = "mom@gmail.com";

        // Test instance methods 
        students[3] = new Student();
        students[3].name = names[3];
        students[3].age = ages[3];
        students[3].copyHomeInfo(students[0]);
        students[3].setStudentPassword();

        // Print all student info
        for (int x=0; x<=3; x++){
        students[x].print();}

        //test checkPassword
        System.out.println("Password check:  " + students[0].checkPassword("no"));
        String pass = students[0].password;
        System.out.println("Valid password check: " + students[0].checkPassword(pass));

    }
}

class Student {
    String name, address, phone, email, password;
    int age;

    public void print() {
        System.out.println("-------------------------------------------------");
        System.out.println("STUDENT INFO |             ");
        System.out.println("Name         | " + this.name);
        System.out.println("Age          | " + this.age);
        System.out.println("Password     | " + this.password);
        System.out.println("---------------------------");
        System.out.println("CONTACT INFO |             ");
        System.out.println("Address      | " + this.address);
        System.out.println("Phone        | " + this.phone);
        System.out.println("Email        | " + this.email);
        System.out.println("-------------------------------------------------");
    }

    public void setStudentPassword() {
        this.password = this.name.substring(1, 2) + (this.age % 10) + this.address.substring(0, 1) + this.phone.substring(3, 6);
    }

    public boolean checkPassword(String password) {
        if (password == this.password) {
            return true;
        } else {
            return false;
        }
    }

    public void copyHomeInfo(Student other) {
        this.address = other.address; this.phone = other.phone; this.email = other.email;
    }
}