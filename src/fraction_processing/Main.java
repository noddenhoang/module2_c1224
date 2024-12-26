package fraction_processing;

public class Main {
    public static void main(String[] args) {
        Fraction ps1 = new Fraction();
        System.out.println("=====Nhập phân số thứ nhất=====");
        ps1.setTuSo();
        ps1.setMauSo();
        ps1.outPut();
        System.out.println("=====Nhập phân số thứ hai=====");
        Fraction ps2 = new Fraction();
        ps2.setTuSo();
        ps2.setMauSo();
        ps2.outPut();
        System.out.print("Tổng hai phân số: ");
        Fraction tong = ps1.Tong(ps2);
        tong.outPut();
        System.out.print("Hiệu hai phân số : ");
        Fraction hieu = ps1.Hieu(ps2);
        hieu.outPut();
        System.out.print("Tích hai phân số : ");
        Fraction tich = ps1.Tich(ps2);
        tich.outPut();
        System.out.print("Thương hai tham số: ");
        Fraction thuong = ps1.Thuong(ps2);
        thuong.outPut();
    }
}
