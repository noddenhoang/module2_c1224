package smartphone_managerment;

import java.math.BigDecimal;
import java.util.*;

public class Smartphone {
    private String id;
    static ArrayList<NewPhone> newPhones = new ArrayList<>();
    static ArrayList<SecondHandPhone> secondHandPhones = new ArrayList<>();
    static int n = 5;
    static int m = 5;
    private String model;
    private BigDecimal price;
    private int guarantee;
    private String brand;
    static Scanner sc = new Scanner(System.in);

    static {
        newPhones.add(new NewPhone("iPhone 14", "Apple", BigDecimal.valueOf(24000000), 12, 48)); // iPhone 14, bảo hành 12 tháng, camera 48MP
        newPhones.add(new NewPhone("Galaxy S23", "Samsung", BigDecimal.valueOf(23000000), 12, 50)); // Galaxy S23, bảo hành 12 tháng, camera 50MP
        newPhones.add(new NewPhone("Xiaomi 13", "Xiaomi", BigDecimal.valueOf(17000000), 12, 50)); // Xiaomi 13, bảo hành 12 tháng, camera 50MP
        newPhones.add(new NewPhone("Oppo Find X6", "Oppo", BigDecimal.valueOf(18000000), 12, 50)); // Oppo Find X6, bảo hành 12 tháng, camera 50MP
        newPhones.add(new NewPhone("Vivo X90 Pro", "Vivo", BigDecimal.valueOf(8000000), 12, 50)); // Vivo X90 Pro, bảo hành 12 tháng, camera 50MP

        secondHandPhones.add(new SecondHandPhone("iPhone 12", "Apple", BigDecimal.valueOf(12000000), 6, 12, "Điện thoại cũ, pin còn 80%, hình thức còn đẹp, hoạt động tốt"));
        secondHandPhones.add(new SecondHandPhone("Galaxy S21", "Samsung", BigDecimal.valueOf(10000000), 6, 40, "Máy cũ, viền có vết xước nhẹ, pin còn 70%, camera 40MP"));
        secondHandPhones.add(new SecondHandPhone("Redmi Note 9", "Xiaomi", BigDecimal.valueOf(5000000), 6, 48, "Điện thoại cũ, camera 48MP, pin còn 60%, hình thức bình thường"));
        secondHandPhones.add(new SecondHandPhone("Oppo Reno 6", "Oppo", BigDecimal.valueOf(8000000), 6, 64, "Máy đã qua sử dụng, ngoại hình tốt, pin còn 50%"));
        secondHandPhones.add(new SecondHandPhone("Vivo Y72", "Vivo", BigDecimal.valueOf(6000000), 6, 64, "Máy cũ, hình thức đẹp, pin còn 40%, camera 64MP"));
    }

    public Smartphone() {
    }

    public Smartphone(String model, String brand, BigDecimal price, int guarantee) {
        this.model = model;
        this.price = price;
        this.guarantee = guarantee;
        this.brand = brand;
    }

    public Smartphone(String id, String model, String brand, BigDecimal price, int guarantee) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.guarantee = guarantee;
        this.brand = brand;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void inputPhone(String id) {
        this.id = id;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        this.model = sc.nextLine();
        System.out.print("Nhập thương hiệu: ");
        this.brand = sc.nextLine();
        System.out.print("Nhập giá: ");
        this.price = new BigDecimal(sc.nextLine());
        System.out.print("Nhập thời gian bảo hành: ");
        this.guarantee = Integer.parseInt(sc.nextLine());
    }

    public void outputPhone() {
        System.out.printf("ID: %s\t|Model: %s\t|Thương hiệu: %s\t|Giá: %.0f VND\t|Bảo hành: %d tháng\t", id, model, brand, price, guarantee);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void outputAllPhone() {
        System.out.println("Danh sách điện thoại mới: ");
        for (NewPhone newPhone : newPhones) {
            newPhone.outputPhone();
        }
        System.out.println("Danh sách điện thoại cũ: ");
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

    public void deletePhone() {
        Scanner sc = new Scanner(System.in);
        boolean isExist = true;
        String delID;
        do {
            System.out.print("Nhập ID sản phẩm cần xóa: ");
            delID = sc.nextLine();
            if (delID.length() == 6 || delID.startsWith("DTM") || delID.startsWith("DTC")) {
                if (delID.startsWith("DTM") && newPhones.isEmpty()) {
                    System.out.println("Không có sản phẩm nào.");
                    isExist = false;
                } else if (delID.startsWith("DTC") && secondHandPhones.isEmpty()) {
                    System.out.println("Không có sản phẩm nào.");
                    isExist = false;
                } else {
                    if (delID.startsWith("DTM")) {
                        for (int i = 0; i < newPhones.size(); i++) {
                            if (newPhones.get(i).getId().equals(delID)) {
                                System.out.println("Bạn có muốn xoá sản phẩm này không? (Y/N)");
                                String choice = sc.nextLine();
                                if (choice.equalsIgnoreCase("Y")) {
                                    newPhones.remove(i);
                                    m--;
                                    isExist = true;
                                    break;
                                } else {
                                    isExist = true;
                                    break;
                                }
                            } else {
                                isExist = false;
                            }
                        }
                    } else {
                        for (int i = 0; i < secondHandPhones.size(); i++) {
                            if (secondHandPhones.get(i).getId().equals(delID)) {
                                System.out.println("Bạn có muốn xoá sản phẩm này không? (Y/N)");
                                String choice = sc.nextLine();
                                if (choice.equalsIgnoreCase("Y")) {
                                    secondHandPhones.remove(i);
                                    n--;
                                    isExist = true;
                                    break;
                                } else {
                                    isExist = true;
                                    break;
                                }
                            } else {
                                isExist = false;
                            }
                        }
                    }
                }
            } else {
                System.out.println("ID không hợp lệ.");
                isExist = false;
            }
        } while (!isExist);
    }
}