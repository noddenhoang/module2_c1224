package smartphone_managerment;

import java.math.BigDecimal;
import java.util.*;

public class SecondHandPhone extends Smartphone implements Comparable<SecondHandPhone> {
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

    public SecondHandPhone(String id, String model, String brand, BigDecimal price, int guarantee, double pin, String description) {
        super(id, model, brand, price, guarantee);
        this.pin = pin;
        this.description = description;
        countSecondHand++;
    }

    public SecondHandPhone(String model, String brand, BigDecimal price, int guarantee, double pin, String description) {
        super(model, brand, price, guarantee);
        countSecondHand++;
        id = idSecondHand + String.format("%03d", countSecondHand);
        super.setID(id);
        this.pin = pin;
        this.description = description;
    }

    public void inputPhone() {
//        String idStr = String.format("%03d", countSecondHand);
        id = idSecondHand + String.format("%03d", countSecondHand);;
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
        System.out.printf("|Dung lượng pin: %.2f\t|Mô tả: %s\n", pin, description);
    }

    public String getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return super.getPrice();
    }

    public String getModel() {
        return super.getModel();
    }

    public String getBrand() {
        return super.getBrand();
    }

    public void setPrice(BigDecimal price) {
        super.setPrice(price);
    }

    @Override
    public int compareTo(SecondHandPhone other) {
        return this.getPrice().compareTo(other.getPrice());
    }
}
