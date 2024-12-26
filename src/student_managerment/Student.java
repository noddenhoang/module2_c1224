package student_managerment;

import java.util.*;

public class Student {
    static Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private double mathScore;
    private double literatureScore;

    Student() {
    }

    public void input() {
        System.out.print("Nhập ID: ");
        this.id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập họ và tên: ");
        this.name = sc.nextLine();

        System.out.print("Nhập điểm toán: ");
        this.mathScore = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm văn: ");
        this.literatureScore = Double.parseDouble(sc.nextLine());
    }

    public void output() {
        System.out.println("ID: " + this.id);
        System.out.println("Họ và tên: " + this.name);
        System.out.println("Điểm toán: " + this.mathScore);
        System.out.println("Điểm văn: " + this.literatureScore);
        System.out.println("Điểm trung bình: " + this.getAverageScore());
    }

    public double getAverageScore() {
        return (this.mathScore + this.literatureScore) / 2;
    }
}
