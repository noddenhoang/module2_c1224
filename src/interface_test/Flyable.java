package interface_test;

public interface Flyable {
    int MAX = 100;
    default void fly(){
        System.out.println("I'm flying");
    }
}
