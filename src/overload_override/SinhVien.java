package overload_override;

public class SinhVien extends HocVien {
    //TH1
    public void a() {
        System.out.println("a con");
    }

    //TH2
    void b() {
        System.out.println("b con");
    }

    //TH3
    public void c() {
        System.out.println("c con");
    }

    //TH4
//    protected void d() {
//        System.out.println("d con");
//    }
//    public int e() {
//        System.out.println("e con");
//        return 1;
//    }
    public Dog f() {
        System.out.println("f con");
        return null;
    }

    public void g(int i) {
    }

    public static void h() {
    }

    public void i(double c, int d) {
        System.out.println(c + " " + d);
    }

    public void k(int c, int d) {
        System.out.println(c + " " + d);
    }
}
