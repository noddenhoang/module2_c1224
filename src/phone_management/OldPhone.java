package phone_management;

public class OldPhone extends Phone{
    private String id;
    private double percentBattery;
    private String description;

    public OldPhone() {
    }

    public OldPhone(String model, String brand, double price, int guarantee, double percentBattery, String description) {
        super(model, brand, price, guarantee);
        countOldPhone++;
        id = idOldPhone + String.format("%03d", countOldPhone);
        super.setId(id);
        this.percentBattery = percentBattery;
        this.description = description;
    }


    public void input() {
        super.input();
        id = idOldPhone + String.format("%03d", countOldPhone);
        super.setId(id);
        System.out.print("Nhập dung lượng pin còn lại (%): ");
        this.percentBattery = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập mô tả: ");
        this.description = String.valueOf(sc.nextLine());
    }

    public void update(String upID) {
        super.input();
        super.setId(upID);
        System.out.print("Nhập dung lượng pin còn lại (%): ");
        this.percentBattery = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập mô tả: ");
        this.description = String.valueOf(sc.nextLine());
    }

    public void output() {
        super.output();
        System.out.printf("Pin còn lại: %.0f%%\t|Mô tả: %s\n", percentBattery, description);
    }

    public double getPercentBattery() {
        return percentBattery;
    }

    public void setPercentBattery(double percentBattery) {
        this.percentBattery = percentBattery;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
