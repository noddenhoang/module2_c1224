package count_student;

public class Student {
    private int id;
    private String name;
    private double score;
    static int count = 0;

    public Student() {
        count++;
    }

    public Student(int id, String name, double score) {
        count++;
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void outputCount() {
        System.out.println("Số lượng sinh viên: " + count);
    }
}
