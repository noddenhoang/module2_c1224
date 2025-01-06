package hashset;

import java.util.HashSet;

public class Exercise1B {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 7, 5, 3, 7, 5};

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i : arr) {
            if (!set.contains(i)) {
                set.add(i);
                sum += i;
            }
        }
        System.out.println("Tong cac phan tu trong mang: " + sum);
    }
}
