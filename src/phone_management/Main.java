package phone_management;

import java.util.*;

public class Main extends Phone {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Phone> phoneList = new ArrayList<>();

    static {
        phoneList.add(new OldPhone("Nokia 1202", "Nokia", 200000, 12, 50, "Điện thoại cơ bản"));
        phoneList.add(new OldPhone("Samsung Galaxy S10", "Samsung", 20000000, 12, 100, "Điện thoại cao cấp"));

        phoneList.add(new NewPhone("iPhone 12", "Apple", 30000000, 12, 10));
        phoneList.add(new NewPhone("Xiaomi Redmi Note 10", "Xiaomi", 5000000, 12, 20));
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("-- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI --");
            System.out.println("1. Xem danh sách điện thoại.");
            System.out.println("2. Thêm điện thoại.");
            System.out.println("3. Sửa thông tin điện thoại.");
            System.out.println("4. Xóa điện thoại.");
            System.out.println("5. Sắp xếp theo giá.");
            System.out.println("6. Tìm kiếm điện thoại.");
            System.out.println("7. Tính tổng tiền.");
            System.out.println("8. Giảm giá cho điện thoại cũ.");
            System.out.println("9. Thoát.");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.next());
            String choiceStr;
            switch (choice) {
                case 1:
                    menuShowPhoneList();
                    break;
                case 2:
                    menuAddPhone();
                    break;
                case 3:
                    updatePhone();
                    break;
                case 4:
                    deletePhone();
                    break;
                case 5:
                    menuSortByPrice();
                    break;
                case 6:
                    menuSearchPhone();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }

    // Hiển thị danh sách điện thoại
    public static void menuShowPhoneList() {
        do {
            System.out.println("-- DANH SÁCH ĐIỆN THOẠI --");
            System.out.println("1. Hiển thị tất cả điện thoại.");
            System.out.println("2. Hiển thị điện thoại cũ.");
            System.out.println("3. Hiển thị điện thoại mới.");
            System.out.println("4. Quay lại.");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.next());
            String choiceStr;
            switch (choice) {
                case 1:
                    showPhoneList(phoneList);
                    System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                    sc.nextLine();
                    if (sc.nextLine() != null) {
                        break;
                    }
                case 2:
                    showOldPhoneList(phoneList);
                    System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                    sc.nextLine();
                    if (sc.nextLine() != null) {
                        break;
                    }
                case 3:
                    showNewPhoneList(phoneList);
                    System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                    sc.nextLine();
                    if (sc.nextLine() != null) {
                        break;
                    }
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }

    public static void showPhoneList(ArrayList<Phone> phoneList) {
        for (Phone phone : phoneList) {
            phone.output();
        }
    }

    public static void showOldPhoneList(ArrayList<Phone> phoneList) {
        for (Phone phone : phoneList) {
            if (phone instanceof OldPhone) {
                phone.output();
            }
        }
    }

    public static void showNewPhoneList(ArrayList<Phone> phoneList) {
        for (Phone phone : phoneList) {
            if (phone instanceof NewPhone) {
                phone.output();
            }
        }
    }

    // Thêm điện thoại
    public static void menuAddPhone() {
        do {
            System.out.println("-- THÊM ĐIỆN THOẠI --");
            System.out.println("1. Thêm điện thoại cũ.");
            System.out.println("2. Thêm điện thoại mới.");
            System.out.println("3. Quay lại.");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.next());
            switch (choice) {
                case 1:
                    countOldPhone++;
                    addOldPhone();
                    break;
                case 2:
                    countNewPhone++;
                    addNewPhone();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }

    public static void addOldPhone() {
        OldPhone oldPhone = new OldPhone();
        oldPhone.input();
        phoneList.add(oldPhone);
        System.out.println("Đã thêm điện thoại cũ thành công.");
    }

    public static void addNewPhone() {
        NewPhone newPhone = new NewPhone();
        newPhone.input();
        phoneList.add(newPhone);
        System.out.println("Đã thêm điện thoại mới thành công.");
    }

    // Sửa thông tin điện thoại
    public static void updatePhone() {
        System.out.print("Nhập ID điện thoại cần sửa: ");
        String id = sc.next();
        if (id.length() == 6 && id.startsWith("DTM") || id.startsWith("DTC")) {
            boolean isExisted = false;
            for (Phone phone : phoneList) {
                if (phone.getId().equals(id)) {
                    if (phone instanceof OldPhone) {
                        OldPhone oldPhone = (OldPhone) phone;
                        oldPhone.update(id);
                    } else if (phone instanceof NewPhone) {
                        NewPhone newPhone = (NewPhone) phone;
                        newPhone.update(id);
                    }
                    isExisted = true;
                    break;
                }
            }
            if (!isExisted) {
                System.out.println("ID không tồn tại.");
            }
        } else {
            System.out.println("ID không hợp lệ.");
        }
    }

    // Xóa điện thoại
    public static void deletePhone() {
        System.out.print("Nhập ID điện thoại cần xóa: ");
        String id = sc.next();
        if (id.length() == 6 && id.startsWith("DTM") || id.startsWith("DTC")) {
            boolean isExisted = false;
            for (Phone phone : phoneList) {
                if (phone.getId().equals(id)) {
                    System.out.println("Bạn có chắc chắn muốn xóa điện thoại này? (Y/N)");
                    String choice = sc.next();
                    if (choice.equalsIgnoreCase("Y")) {
                        phoneList.remove(phone);
                        System.out.println("Đã xóa điện thoại thành công.");
                    } else {
                        System.out.println("Đã hủy thao tác.");
                    }
                    isExisted = true;
                    break;
                }
            }
            if (!isExisted) {
                System.out.println("ID không tồn tại.");
            }
        } else {
            System.out.println("ID không hợp lệ.");
        }
    }

    //Sắp xếp theo giá
    public static void menuSortByPrice() {
        do {
            System.out.println("-- SẮP XẾP THEO GIÁ --");
            System.out.println("1. Giá thấp đến cao.");
            System.out.println("2. Giá cao đến thấp.");
            System.out.println("3. Quay lại.");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.next());
            String choiceStr;
            switch (choice) {
                case 1:
                    sortByPriceAscending();
                    System.out.print("Nhập bất kỳ để tiếp tục: ");
                    choiceStr = sc.next();
                    if (!choiceStr.isEmpty()) {
                        break;
                    }
                case 2:
                    sortByPriceDescending();
                    System.out.print("Nhập bất kỳ để tiếp tục: ");
                    choiceStr = sc.next();
                    if (!choiceStr.isEmpty()) {
                        break;
                    }
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }

    public static void sortByPriceAscending() {
        Collections.sort(phoneList, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        showPhoneList(phoneList);
    }

    public static void sortByPriceDescending() {
        Collections.sort(phoneList, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
        showPhoneList(phoneList);
    }

    // Tìm kiếm điện thoại
    public static void menuSearchPhone() {
        do {
            System.out.println("-- TÌM KIẾM ĐIỆN THOẠI --");
            System.out.println("1. Tất cả loại điện thoại.");
            System.out.println("2. Điện thoại cũ.");
            System.out.println("3. Điện thoại mới.");
            System.out.println("4. Quay lại.");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.next());
            String choiceStr;
            switch (choice) {
                case 1:
                    menuSearchAllPhone();
                    break;
                case 2:
                    menuSearchOldPhone();
                    break;
                case 3:
                    menuSearchNewPhone();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }

    public static void menuSearchAllPhone() {
        do {
            System.out.println("-- TÌM KIẾM TẤT CẢ LOẠI ĐIỆN THOẠI --");
            System.out.println("1. Tìm kiếm theo giá điện thoại.");
            System.out.println("2. Tìm kiếm theo tên điện thoại.");
            System.out.println("3. Tìm kiếm theo hãng điện thoại.");
            System.out.println("4. Quay lại.");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.next());
            switch (choice) {
                case 1:
                    searchPhoneByPrice();
                    break;
                case 2:
                    searchPhoneByName();
                    break;
                case 3:
                    searchPhoneByBrand();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }

    public static void searchPhoneByPrice() {
        double fromPrice, toPrice;
        System.out.print("Nhập giá điện thoại cần tìm từ: ");
        fromPrice = Double.parseDouble(sc.next());
        System.out.print("Nhập giá điện thoại cần tìm đến: ");
        toPrice = Double.parseDouble(sc.next());
        boolean isExisted = false;
        String choiceStr;
        for (Phone phone : phoneList) {
            if (phone.getPrice() >= fromPrice && phone.getPrice() <= toPrice) {
                phone.output();
                isExisted = true;
                System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                choiceStr = sc.next();
                if (!choiceStr.isEmpty()) {
                    break;
                }
            }
        }
        if (!isExisted) {
            System.out.println("Không tìm thấy điện thoại nào.");
        }
    }

    public static void searchPhoneByName() {
        System.out.print("Nhập tên điện thoại cần tìm: ");
        String name = sc.next();
        boolean isExisted = false;
        String choiceStr;
        for (Phone phone : phoneList) {
            if (phone.getModel().equalsIgnoreCase(name)) {
                phone.output();
                isExisted = true;
                System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                choiceStr = sc.next();
                if (!choiceStr.isEmpty()) {
                    break;
                }
            }
        }
        if (!isExisted) {
            System.out.println("Không tìm thấy điện thoại nào.");
        }
    }

    public static void searchPhoneByBrand() {
        System.out.print("Nhập hãng điện thoại cần tìm: ");
        String brand = sc.next();
        boolean isExisted = false;
        String choiceStr;
        for (Phone phone : phoneList) {
            if (phone.getBrand().equalsIgnoreCase(brand)) {
                phone.output();
                isExisted = true;
                System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                choiceStr = sc.next();
                if (!choiceStr.isEmpty()) {
                    break;
                }
            }
        }
        if (!isExisted) {
            System.out.println("Không tìm thấy điện thoại nào.");
        }
    }

    public static void menuSearchOldPhone() {
        do {
            System.out.println("-- TÌM KIẾM ĐIỆN THOẠI CŨ --");
            System.out.println("1. Tìm kiếm theo giá điện thoại cũ.");
            System.out.println("2. Tìm kiếm theo tên điện thoại cũ.");
            System.out.println("3. Tìm kiếm theo hãng điện thoại cũ.");
            System.out.println("4. Quay lại.");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.next());
            switch (choice) {
                case 1:
                    searchOldPhoneByPrice();
                    break;
                case 2:
                    searchOldPhoneByName();
                    break;
                case 3:
                    searchOldPhoneByBrand();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }

    public static void searchOldPhoneByPrice() {
        double fromPrice, toPrice;
        System.out.print("Nhập giá điện thoại cũ cần tìm từ: ");
        fromPrice = Double.parseDouble(sc.next());
        System.out.print("Nhập giá điện thoại cũ cần tìm đến: ");
        toPrice = Double.parseDouble(sc.next());
        boolean isExisted = false;
        for (Phone phone : phoneList) {
            if (phone.getPrice() >= fromPrice && phone.getPrice() <= toPrice && phone instanceof OldPhone) {
                phone.output();
                isExisted = true;
            }
        }
        if (!isExisted) {
            System.out.println("Không tìm thấy điện thoại cũ nào.");
        }
    }

    public static void searchOldPhoneByName() {
        System.out.print("Nhập tên điện thoại cũ cần tìm: ");
        String name = sc.next();
        boolean isExisted = false;
        String choiceStr;
        for (Phone phone : phoneList) {
            if (phone.getModel().equalsIgnoreCase(name) && phone instanceof OldPhone) {
                phone.output();
                isExisted = true;
                System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                choiceStr = sc.next();
                if (!choiceStr.isEmpty()) {
                    break;
                }
            }
        }
        if (!isExisted) {
            System.out.println("Không tìm thấy điện thoại cũ nào.");
        }
    }

    public static void searchOldPhoneByBrand() {
        System.out.print("Nhập hãng điện thoại cũ cần tìm: ");
        String brand = sc.next();
        boolean isExisted = false;
        String choiceStr;
        for (Phone phone : phoneList) {
            if (phone.getBrand().equalsIgnoreCase(brand) && phone instanceof OldPhone) {
                phone.output();
                isExisted = true;
                System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                choiceStr = sc.next();
                if (!choiceStr.isEmpty()) {
                    break;
                }
            }
        }
        if (!isExisted) {
            System.out.println("Không tìm thấy điện thoại cũ nào.");
        }
    }

    public static void menuSearchNewPhone() {
        do {
            System.out.println("-- TÌM KIẾM ĐIỆN THOẠI MỚI --");
            System.out.println("1. Tìm kiếm theo giá điện thoại mới.");
            System.out.println("2. Tìm kiếm theo tên điện thoại mới.");
            System.out.println("3. Tìm kiếm theo hãng điện thoại mới.");
            System.out.println("4. Quay lại.");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.next());
            switch (choice) {
                case 1:
                    searchNewPhoneByPrice();
                    break;
                case 2:
                    searchNewPhoneByName();
                    break;
                case 3:
                    searchNewPhoneByBrand();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }

    public static void searchNewPhoneByPrice() {
        double fromPrice, toPrice;
        System.out.print("Nhập giá điện thoại mới cần tìm từ: ");
        fromPrice = Double.parseDouble(sc.next());
        System.out.print("Nhập giá điện thoại mới cần tìm đến: ");
        toPrice = Double.parseDouble(sc.next());
        boolean isExisted = false;
        String choiceStr;
        for (Phone phone : phoneList) {
            if (phone.getPrice() >= fromPrice && phone.getPrice() <= toPrice && phone instanceof NewPhone) {
                phone.output();
                isExisted = true;
                System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                choiceStr = sc.next();
                if (!choiceStr.isEmpty()) {
                    break;
                }
            }
        }
        if (!isExisted) {
            System.out.println("Không tìm thấy điện thoại mới nào.");
        }
    }

    public static void searchNewPhoneByName() {
        System.out.print("Nhập tên điện thoại mới cần tìm: ");
        String name = sc.next();
        boolean isExisted = false;
        String choiceStr;
        for (Phone phone : phoneList) {
            if (phone.getModel().equalsIgnoreCase(name) && phone instanceof NewPhone) {
                phone.output();
                isExisted = true;
                System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                choiceStr = sc.next();
                if (!choiceStr.isEmpty()) {
                    break;
                }
            }
        }
        if (!isExisted) {
            System.out.println("Không tìm thấy điện thoại mới nào.");
        }
    }

    public static void searchNewPhoneByBrand() {
        System.out.print("Nhập hãng điện thoại mới cần tìm: ");
        String brand = sc.next();
        boolean isExisted = false;
        String choiceStr;
        for (Phone phone : phoneList) {
            if (phone.getBrand().equalsIgnoreCase(brand) && phone instanceof NewPhone) {
                phone.output();
                isExisted = true;
                System.out.print("Nhấn phím bất kỳ để tiếp tục: ");
                choiceStr = sc.next();
                if (!choiceStr.isEmpty()) {
                    break;
                }
            }
        }
        if (!isExisted) {
            System.out.println("Không tìm thấy điện thoại mới nào.");
        }
    }
}
