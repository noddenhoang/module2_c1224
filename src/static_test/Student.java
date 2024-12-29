package static_test;

public class Student extends Person {
    private double gpa;

    public Student(){
        super();
    }

    public Student(int id, String name, double gpa){
        super(id, name);
        this.gpa = gpa;
    }

    public void input(){
        super.input();
        System.out.print("Enter GPA: ");
        gpa = Double.parseDouble(sc.next());
    }

    public void output(){
        super.output();
        System.out.printf("GPA: %f\n", gpa);
    }

}
