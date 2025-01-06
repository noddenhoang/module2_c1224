package da_hinh_test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                ((Cat) animal).catchMouse();
            } else if (animal instanceof Dog) {
                ((Dog) animal).bark();
            }
            animal.eat();
        }
    }
}
