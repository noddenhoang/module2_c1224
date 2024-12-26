package coordinate_n_distance;

import java.util.Scanner;

public class Point {
    private double x;
    private double y;
    static Scanner sc = new Scanner(System.in);

    public Point() {
    }

    public void input() {
        System.out.print("Nhập x: ");
        this.x = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập y: ");
        this.y = Double.parseDouble(sc.nextLine());
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}
