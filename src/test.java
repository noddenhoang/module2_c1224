public class test {
    public static void main(String[] args) {
//        System.out.println("DTC013".matches("DTC[0-9]{3}"));
//        System.out.println("DTC01".matches("DTC[0-9]{3}"));
//        System.out.println("DTM013".matches("DTC[0-9]{3}"));
        System.out.println("0356329282".matches("(0|[(][+]84[)])[0-9]{9}"));
        System.out.println("(+84)356329282".matches("(0|[(][+]84[)])[0-9]{9}"));
        System.out.println("123456789".matches("(0|[(][+]84[)])[0-9]{9}"));
        System.out.println("-09123456789".matches("(0|[(][+]84[)])[0-9]{9}"));
    }
}
