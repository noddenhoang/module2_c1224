package regex;

public class Regex {
    public static void main(String[] args) {
        // Kiểm tra số điện thoại
        System.out.println("0356329282".matches("(0|[(][+]84[)])[0-9]{9}"));
        System.out.println("(+84)356329282".matches("(0|[(][+]84[)])[0-9]{9}"));
        System.out.println("123456789".matches("(0|[(][+]84[)])[0-9]{9}"));
        System.out.println("-09123456789".matches("(0|[(][+]84[)])[0-9]{9}"));
        // Kiểm tra e-mail
        System.out.println("thaihoangbao181003@gmail.com".matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+"));
        System.out.println("thaihoangbao181003@gmailcom".matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+"));
        System.out.println("thaihoangbao181003gmail.com".matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+"));
        // Kiểm tra UserName
        System.out.println("thaihoangbao".matches("[a-zA-Z0-9_]{6,32}"));
        System.out.println("thaihoangbao181003".matches("[a-zA-Z0-9_]{6,32}"));
        System.out.println("thaihoangbao181003@".matches("[a-zA-Z0-9_]{6,32}"));
        System.out.println("11111111111111111111111111111.11".matches("[a-zA-Z0-9_.]{6,32}"));
        //Kiểm tra Password
        System.out.println("Thaithai".matches("[A-Z][a-zA-Z0-9_]{5,31}"));
        System.out.println("Thaib".matches("[A-Z][a-zA-Z0-9_]{5,31}"));
        System.out.println("thaithai181003@".matches("[A-Z][a-zA-Z0-9_]{5,31}"));
    }
}
