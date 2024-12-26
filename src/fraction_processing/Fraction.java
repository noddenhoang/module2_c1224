package fraction_processing;

import java.util.*;

public class Fraction {
    static Scanner sc = new Scanner(System.in);
    private int tuSo;
    private int mauSo;

    public Fraction() {
    }

    public void setTuSo() {
        System.out.print("Nhập tử số: ");
        this.tuSo = Integer.parseInt(sc.nextLine());
    }

    public void setMauSo() {
        do {
            System.out.print("Nhập mẫu số: ");
            this.mauSo = Integer.parseInt(sc.nextLine());
            if (this.mauSo == 0) {
                System.out.print("Mẫu số phải khác 0, mời nhập lại!");
            }
        } while (this.mauSo == 0);
    }

    public void outPut() {
        int a = this.tuSo;
        int b = this.mauSo;
        if (a % b == 0) {
            System.out.println("Phân số: " + this.tuSo / this.mauSo);
        } else {
            int ucln;
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            ucln = a;
            System.out.println("Phân số: " + this.tuSo / ucln + "/" + this.mauSo / ucln);
        }
    }

    public Fraction Tong(Fraction ps) {
        Fraction kq = new Fraction();
        kq.tuSo = this.tuSo * ps.mauSo + this.mauSo * ps.tuSo;
        kq.mauSo = this.mauSo * ps.mauSo;
        return kq;
    }

    public Fraction Hieu(Fraction ps) {
        Fraction kq = new Fraction();
        kq.tuSo = this.tuSo * ps.mauSo - this.mauSo * ps.tuSo;
        kq.mauSo = this.mauSo * ps.mauSo;
        return kq;
    }

    public Fraction Tich(Fraction ps) {
        Fraction kq = new Fraction();
        kq.tuSo = this.tuSo * ps.tuSo;
        kq.mauSo = this.mauSo * ps.mauSo;
        return kq;
    }

    public Fraction Thuong(Fraction ps) {
        Fraction kq = new Fraction();
        kq.tuSo = this.tuSo * ps.mauSo;
        kq.mauSo = this.mauSo * ps.tuSo;
        return kq;
    }
}
