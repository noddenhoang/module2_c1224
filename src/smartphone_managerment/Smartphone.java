package smartphone_managerment;

import java.util.*;

public class Smartphone {
    private String id;
    static ArrayList<NewPhone> newPhones = new ArrayList<>();
    static ArrayList<SecondHandPhone> secondHandPhones = new ArrayList<>();
    static int n = 5;
    static int m = 5;
    private String model;
    private double price;
    private int guarantee;
    private String brand;

    static {
        newPhones.add(new NewPhone("DTM001", "iPhone 14", "Apple", 24000, 12, 48)); // iPhone 14, bảo hành 12 tháng, camera 48MP
        newPhones.add(new NewPhone("DTM002", "Galaxy S23", "Samsung", 23000, 12, 50)); // Galaxy S23, bảo hành 12 tháng, camera 50MP
        newPhones.add(new NewPhone("DTM003", "Xiaomi 13", "Xiaomi", 17000, 12, 50)); // Xiaomi 13, bảo hành 12 tháng, camera 50MP
        newPhones.add(new NewPhone("DTM004", "Oppo Find X6", "Oppo", 18000, 12, 50)); // Oppo Find X6, bảo hành 12 tháng, camera 50MP
        newPhones.add(new NewPhone("DTM005", "Vivo X90 Pro", "Vivo", 20000, 12, 50)); // Vivo X90 Pro, bảo hành 12 tháng, camera 50MP

        secondHandPhones.add(new SecondHandPhone("DTC001", "iPhone 12", "Apple", 12000, 6, 12, "Điện thoại cũ, pin còn 80%, hình thức còn đẹp, hoạt động tốt"));
        secondHandPhones.add(new SecondHandPhone("DTC002", "Galaxy S21", "Samsung", 10000, 6, 40, "Máy cũ, viền có vết xước nhẹ, pin còn 70%, camera 40MP"));
        secondHandPhones.add(new SecondHandPhone("DTC003", "Redmi Note 9", "Xiaomi", 5000, 6, 48, "Điện thoại cũ, camera 48MP, pin còn 60%, hình thức bình thường"));
        secondHandPhones.add(new SecondHandPhone("DTC004", "Oppo Reno 6", "Oppo", 8000, 6, 64, "Máy đã qua sử dụng, ngoại hình tốt, pin còn 50%"));
        secondHandPhones.add(new SecondHandPhone("DTC005", "Vivo Y72", "Vivo", 6000, 6, 64, "Máy cũ, hình thức đẹp, pin còn 40%, camera 64MP"));
    }

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

    public double getPrice() {
        return price;
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
                if (upID.startsWith("DTM") && newPhones.isEmpty()) {
                    System.out.println("Không có sản phẩm nào.");
                    check = false;
                } else if (upID.startsWith("DTC") && secondHandPhones.isEmpty()) {
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
                if (delID.startsWith("DTM") && newPhones.isEmpty()) {
                    System.out.println("Không có sản phẩm nào.");
                    check = false;
                } else if (delID.startsWith("DTC") && secondHandPhones.isEmpty()) {
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