package overload_override;

public class HocVien {
    //TH1
    public void a() {
        System.out.println("a cha");
    }

    //TH2
    void b() {
        System.out.println("b cha");
    }

    //TH3
    private void c() {
        System.out.println("c cha");
    }

    //TH4
//    public void d() {
//        System.out.println("d cha");
//    }
    public byte e() {
        System.out.println("e cha");
        return 1;
    }

    public Animal f() {
        System.out.println("f cha");
        return null;
    }

    public void g() {
    }

    public static void h() {
    }

    public void i(int a, int b) {
        System.out.println(a + " " + b);
    }

    public void j(int a, int b) {
        System.out.println(a + " " + b);
    }
}
