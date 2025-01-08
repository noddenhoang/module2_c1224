package phone_management;

import phone_management.validation.PhoneValidation;

public class NewPhone extends Phone {
    private int quantity;
    private String id;

    public NewPhone() {
    }
    public NewPhone(String model, String brand, double price, int guarantee, int quantity) {
        super(model, brand, price, guarantee);
        countNewPhone++;
        id = idNewPhone + String.format("%03d", countNewPhone);
        super.setId(id);
        this.quantity = quantity;
    }


    public void input() {
        super.input();
        countNewPhone++;
        id = idNewPhone + String.format("%03d", countNewPhone);
        super.setId(id);
        this.quantity = PhoneValidation.inputQuantity("Số lượng: ");
    }

    public void update(String upID) {
        super.input();
        super.setId(upID);
        this.quantity = PhoneValidation.inputQuantity("Số lượng: ");
    }

    public void output() {
        super.output();
        System.out.printf("Số lượng: %d\n", quantity);
    }

    public double calTotalPrice() {
        return quantity * getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
