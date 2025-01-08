package phone_management;

import phone_management.validation.PhoneValidation;

public class OldPhone extends Phone implements Discountable {
    private String id;
    private int percentBattery;
    private String description;

    public OldPhone() {
    }

    public OldPhone(String model, String brand, double price, int guarantee, int percentBattery, String description) {
        super(model, brand, price, guarantee);
        countOldPhone++;
        id = idOldPhone + String.format("%03d", countOldPhone);
        super.setId(id);
        this.percentBattery = percentBattery;
        this.description = description;
    }


    public void input() {
        super.input();
        countOldPhone++;
        id = idOldPhone + String.format("%03d", countOldPhone);
        super.setId(id);
        this.percentBattery = PhoneValidation.inputBatteryCapacity("Dung lượng pin còn lại: ");
        this.description = PhoneValidation.inputDescription("Mô tả: ");
    }

    public void update(String upID) {
        super.input();
        super.setId(upID);
        this.percentBattery = PhoneValidation.inputBatteryCapacity("Dung lượng pin còn lại: ");
        this.description = PhoneValidation.inputDescription("Mô tả: ");
    }

    public void output() {
        super.output();
        System.out.printf("|Pin còn lại: %d\t|Mô tả: %s\n", percentBattery, description);
    }

    public double calTotalPrice() {
        return getPrice();
    }

    public double getPercentBattery() {
        return percentBattery;
    }

    public void setPercentBattery(int percentBattery) {
        this.percentBattery = percentBattery;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void applyDiscount(double percentDiscount) {
        double discountedPrice = getPrice() * (1 - percentDiscount / 100);
        setPrice(discountedPrice);
    }
}
