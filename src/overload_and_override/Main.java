package overload_and_override;

public class Main {
    public static void main(String[] args) {
        Father father = new Father();
        father.sayHello();
        Son son = new Son();
        son.sayHello();
    }
}
