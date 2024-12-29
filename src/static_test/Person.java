package static_test;

import java.util.Scanner;

public class Person {
    private String name;
    private int id;
    static Scanner sc = new Scanner(System.in);

    public Person(){
    }

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void input(){
        System.out.print("Enter ID: ");
        id = Integer.parseInt(sc.next());
        System.out.print("Enter Name: ");
        name = String.valueOf(sc.next());
    }

    public void output(){
        System.out.printf("ID: %d\nName: %s\n", id, name);
    }


}
