package interface_test;

public class Main implements Flyable {
    public static void main(String[] args) {
        Main main = new Main();
        main.fly();
        KhongTheBay khongTheBay = new KhongTheBay();
        khongTheBay.fly();
    }
}
