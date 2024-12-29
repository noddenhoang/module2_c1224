package smartphone_managerment;

import java.util.Scanner;

public class SecondHandPhone extends Smartphone {
    private String id;
    private static String idSecondHand = "DTC";
    private static int countSecondHand = 0;
    private double pin;
    private String description;
    static Scanner sc = new Scanner(System.in);

    public SecondHandPhone() {
        super();
        countSecondHand++;
    }

    public SecondHandPhone(String id, String model, String brand, double price, int guarantee, double pin, String description) {
        super(id, model, brand, price, guarantee);
        this.pin = pin;
        this.description = description;
        countSecondHand++;
    }

    public void inputPhone() {
        String idStr = String.format("%03d", countSecondHand);
        this.id = idSecondHand + idStr;
        super.inputPhone(id);
        System.out.print("Nhập dung lượng pin: ");
        do {
            this.pin = Double.parseDouble(sc.nextLine());
            if (this.pin <= 0 || this.pin > 100) {
                System.out.print("Dung lượng pin không hợp lệ.");
            }
        } while (this.pin <= 0 || this.pin > 100);
        System.out.print("Nhập mô tả: ");
        this.description = String.valueOf(sc.nextLine());
    }

    public void outputPhone() {
        super.outputPhone();
    }

    public String getId() {
        return id;
    }
}
