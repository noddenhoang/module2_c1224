package smartphone_managerment;

import java.util.ArrayList;
import java.util.Scanner;

public class Smartphone {
    private String id;
    static ArrayList<NewPhone> newPhones = new ArrayList<>();
    static ArrayList<SecondHandPhone> secondHandPhones = new ArrayList<>();
    static int n = 0;
    static int m = 0;
    private String model;
    private double price;
    private int guarantee;
    private String brand;

    public Smartphone() {
    }

    public Smartphone(String id, String model, String brand, double price, int guarantee) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.guarantee = guarantee;
        this.brand = brand;
    }

    public void inputPhone(String id) {
        this.id = id;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        this.model = sc.nextLine();
        System.out.print("Nhập thương hiệu: ");
        this.brand = sc.nextLine();
        System.out.print("Nhập giá: ");
        this.price = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập thời gian bảo hành: ");
        this.guarantee = Integer.parseInt(sc.nextLine());
    }

    public void outputPhone() {
        System.out.printf("%s\t|%s\t|%s\t|%.2f\t|%d\n", id, model, brand, price, guarantee);
    }



    public void outputAllPhone() {
        System.out.println("Danh sách điện thoại mới: ");
        System.out.println("ID\t|Tên sản phẩm\t|Thương hiệu\t|Giá\t|Bảo hành");
        for (NewPhone newPhone : newPhones) {
            newPhone.outputPhone();
        }
        System.out.println("Danh sách điện thoại cũ: ");
        System.out.println("ID\t|Tên sản phẩm\t|Thương hiệu\t|Giá\t|Bảo hành");
        for (SecondHandPhone secondHandPhone : secondHandPhones) {
            secondHandPhone.outputPhone();
        }
    }

    public void updatePhone() {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        String upID;
        do {
            System.out.print("Nhập ID sản phẩm cần sửa: ");
            upID = sc.nextLine();
            if (upID.length() == 6 || upID.startsWith("DTM") || upID.startsWith("DTC")) {
                if (upID.startsWith("DTM") && newPhones.size() == 0) {
                    System.out.println("Không có sản phẩm nào.");
                    check = false;
                } else if (upID.startsWith("DTC") && secondHandPhones.size() == 0) {
                    System.out.println("Không có sản phẩm nào.");
                    check = false;
                } else {
                    if (upID.startsWith("DTM")) {
                        for (int i = 0; i < newPhones.size(); i++) {
                            if (newPhones.get(i).getId().equals(upID)) {
                                System.out.println("Nhập thông tin mới: ");
                                newPhones.get(i).inputPhone();
                                check = true;
                                break;
                            } else {
                                check = false;
                            }
                        }
                    } else {
                        for (int i = 0; i < secondHandPhones.size(); i++) {
                            if (secondHandPhones.get(i).getId().equals(upID)) {
                                System.out.println("Nhập thông tin mới: ");
                                secondHandPhones.get(i).inputPhone();
                                check = true;
                                break;
                            } else {
                                check = false;
                            }
                        }
                    }
                }
            } else {
                System.out.println("ID không hợp lệ.");
                check = false;
            }
        } while (!check);
    }

    public void deletePhone(){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        String delID;
        do {
            System.out.print("Nhập ID sản phẩm cần xóa: ");
            delID = sc.nextLine();
            if (delID.length() == 6 || delID.startsWith("DTM") || delID.startsWith("DTC")) {
                if (delID.startsWith("DTM") && newPhones.size() == 0) {
                    System.out.println("Không có sản phẩm nào.");
                    check = false;
                } else if (delID.startsWith("DTC") && secondHandPhones.size() == 0) {
                    System.out.println("Không có sản phẩm nào.");
                    check = false;
                } else {
                    if (delID.startsWith("DTM")) {
                        for (int i = 0; i < newPhones.size(); i++) {
                            if (newPhones.get(i).getId().equals(delID)) {
                                System.out.println("Bạn có muốn xoá sản phẩm này không? (Y/N)");
                                String choice = sc.nextLine();
                                if (choice.equalsIgnoreCase("Y")){
                                    newPhones.remove(i);
                                    check = true;
                                    break;
                                }else {
                                    check = true;
                                    break;
                                }
                            } else {
                                check = false;
                            }
                        }
                    } else {
                        for (int i = 0; i < secondHandPhones.size(); i++) {
                            if (secondHandPhones.get(i).getId().equals(delID)) {
                                secondHandPhones.remove(i);
                                System.out.println("Bạn có muốn xoá sản phẩm này không? (Y/N)");
                                String choice = sc.nextLine();
                                if (choice.equalsIgnoreCase("Y")){
                                    newPhones.remove(i);
                                    check = true;
                                    break;
                                }else {
                                    check = true;
                                    break;
                                }
                            } else {
                                check = false;
                            }
                        }
                    }
                }
            } else {
                System.out.println("ID không hợp lệ.");
                check = false;
            }
        } while (!check);
    }
}