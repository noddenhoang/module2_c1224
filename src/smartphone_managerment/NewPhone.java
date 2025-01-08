package smartphone_managerment;

import java.math.BigDecimal;
import java.util.*;

public class NewPhone extends Smartphone implements Comparable<NewPhone> {
    private String id;
    private static String idNew = "DTM";
    private static int countNew = 0;
    private int quantity;
    static Scanner sc = new Scanner(System.in);
    public NewPhone() {
        super();
        countNew++;
    }

    public NewPhone(String model, String brand, BigDecimal price, int guarantee, int quantity) {
        super(model, brand, price, guarantee);
        countNew++;
        id = idNew + String.format("%03d", countNew);
        super.setID(id);
        this.quantity = quantity;
    }

    public NewPhone(String id, String model, String brand, BigDecimal price, int guarantee, int quantity) {
        super(id,model, brand, price, guarantee);
        this.quantity = quantity;
        countNew++;
    }

    public void inputPhone() {
        String idStr = String.format("%03d", countNew);
        id = idNew + idStr;
        super.inputPhone(id);
        System.out.print("Nhập số lượng: ");
        this.quantity = Integer.parseInt(sc.nextLine());

    }

    public void outputPhone() {
        super.outputPhone();
        System.out.printf("|Số lượng: %d\n", quantity);
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

    @Override
    public int compareTo(NewPhone other) {
        return this.getPrice().compareTo(other.getPrice());
    }
}
