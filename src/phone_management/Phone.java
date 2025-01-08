package phone_management;

import java.util.*;
import phone_management.validation.PhoneValidation;

public abstract class Phone {
    private String id;
    private String model;
    private String brand;
    private double price;
    private int guarantee;
    static String idOldPhone = "DTC";
    static String idNewPhone = "DTM";
    static int countOldPhone = 0;
    static int countNewPhone = 0;

    static Scanner sc = new Scanner(System.in);

    public Phone() {
    }

    public Phone(String model, String brand, double price, int guarantee) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.guarantee = guarantee;
    }

    public void input() {
        this.id = id;
        this.model = PhoneValidation.inputName("Tên điện thoại: ");
        this.brand = PhoneValidation.inputBrand("Thương hiệu: ");
        this.price = PhoneValidation.inputPrice("Giá: ");
        this.guarantee = PhoneValidation.inputGuarantee("Thời gian bảo hành: ");
    }

    public void output() {
        System.out.printf("ID: %s\t|Model: %s\t|Thương hiệu: %s\t|Giá: %.0f VND\t|Bảo hành: %d tháng\t", id, model, brand, price, guarantee);
    }

    public abstract double calTotalPrice();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }
}
