package smartphone_managerment;

import java.util.Scanner;

public class NewPhone extends Smartphone{
    private String id;
    private static String idNew = "DTM";
    private static int countNew = 0;
    private int quantity;
    static Scanner sc = new Scanner(System.in);
    public NewPhone() {
        super();
        countNew++;
    }

    public NewPhone(String id,String model, String brand, double price, int guarantee, int quantity) {
        super(id,model, brand, price, guarantee);
        this.quantity = quantity;
        countNew++;
    }

    public void inputPhone() {
        String idStr = String.format("%03d", countNew);
        this.id = idNew + idStr;
        super.inputPhone(id);
        System.out.print("Nhập số lượng: ");
        this.quantity = Integer.parseInt(sc.nextLine());

    }

    public void outputPhone() {
        super.outputPhone();
    }

    public String getId() {
        return id;
    }
}
