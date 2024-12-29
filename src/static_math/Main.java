package static_math;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b;
        System.out.print("Nhap a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        b = scanner.nextDouble();
        System.out.printf("%.1f + %.1f = %.1f\n", a, b, MathUtil.add(a, b));
        System.out.printf("%.1f - %.1f = %.1f\n", a, b, MathUtil.subtract(a, b));
        System.out.printf("%.1f x %.1f = %.1f\n", a, b, MathUtil.multiply(a, b));
        System.out.printf("%.1f / %.1f = %.1f\n", a, b, MathUtil.divide(a, b));
    }
}
