package student_managerment;

import java.util.*;

public class Student {
    static Scanner sc = new Scanner(System.in);
    int id;
    String name;
    double score;

    Student() {

    }

    Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    void input() {
        System.out.print("Enter ID: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Score: ");
        score = Double.parseDouble(sc.nextLine());
    }

    void output() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
//        goToSchool(message);
    }

    void goToSchool(String vehicle) {
        System.out.println(name + " dang di hoc bang " + vehicle);
    }
}
