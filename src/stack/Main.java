package stack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.toString());
        System.out.println("Gia tri o dau stack la: " + stack.peek());
        System.out.println("Kich co cua stack: " + stack.size());
        stack.toString();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
