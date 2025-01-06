package hashset;

import java.util.TreeSet;

public class Exercise1D {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 7, 5, 7, 1, 0, 3};

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }

        int min = set.first();
        int max = set.last();

        System.out.println("Phan tu nho nhat trong mang: " + min);
        System.out.println("Phan tu lon nhat trong mang: " + max);
    }
}
