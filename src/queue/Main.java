package queue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.toString());
        System.out.println("Kich co cua queue: " + queue.size());
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
