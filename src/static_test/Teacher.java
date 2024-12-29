package static_test;

public class Teacher extends Person {
    private double salary;


    public Teacher(){
        super();
    }

    public Teacher(int id, String name, int salary){
        super(id, name);
        this.salary = salary;
    }

    public void input(){
        super.input();
        System.out.print("Enter Salary: ");
        salary = Double.parseDouble(sc.next());
    }

    public void output(){
        super.output();
        System.out.printf("Salary: %f\n", salary);
    }

}
