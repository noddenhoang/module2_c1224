package student_managerment;

import java.util.*;

public class StudentManagerment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter number of students: ");
            n = Integer.parseInt(sc.nextLine());
        } while (n <= 0);
        Student student = new Student();
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            student = new Student();
            student.input();
            students.add(student);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students.get(i).output();
        }

    }
}
