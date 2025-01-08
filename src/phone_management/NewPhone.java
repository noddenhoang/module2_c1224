package phone_management;

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
        id = idNewPhone + String.format("%03d", countNewPhone);
        super.setId(id);
        System.out.print("Nhập số lượng: ");
        this.quantity = Integer.parseInt(sc.nextLine());
    }

    public void update(String upID) {
        super.input();
        super.setId(upID);
        System.out.print("Nhập số lượng: ");
        this.quantity = Integer.parseInt(sc.nextLine());
    }

    public void output() {
        super.output();
        System.out.printf("Số lượng: %d\n", quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
