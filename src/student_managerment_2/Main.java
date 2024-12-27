package student_managerment_2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Nguyen Van A", 8.5);
        System.out.println("Thông tin sinh viên:");
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getScore());
        System.out.println("---------");
        System.out.println("Cập nhật thông tin sinh viên:");
        student.setName("Nguyễn Văn A");
        student.setScore(10);
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getScore());
        System.out.println("---------");
        student.setScore(11);
        System.out.println(student.getScore());
    }
}
