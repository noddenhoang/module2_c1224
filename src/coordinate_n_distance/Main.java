package coordinate_n_distance;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("Nhập điểm thứ nhất: ");
        p1.input();
        Point p2 = new Point();
        System.out.println("Nhập điểm thứ hai: ");
        p2.input();
        System.out.println("Khoảng cách giữa hai điểm: " + p1.distance(p2));
    }
}
