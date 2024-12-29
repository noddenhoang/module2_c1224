package smartphone_managerment;

import java.util.ArrayList;
import java.util.Scanner;

public class GUI extends Smartphone {
    static Scanner sc = new Scanner(System.in);
    private int choice;

    public void guiMain() {
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
        switch (choice) {
            case 1:
                showPhone();
                break;
            case 2:
                addPhone();
                break;
            case 3:
                updatePhone();
                guiMain();
                break;
            case 4:
                deletePhone();
                guiMain();
                break;
            case 5:
                sortPhone();
                break;
            case 6:
                searchPhone();
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Chức năng không tồn tại.");
        }
    }

    public void showPhone() {
        System.out.println("-- Xem danh sách điện thoại --");
        System.out.println("1. Tất cả.");
        System.out.println("2. Điện thoại cũ.");
        System.out.println("3. Điện thoại mới.");
        System.out.println("4. Quay lại.");
        System.out.print("Chọn chức năng: ");
        choice = Integer.parseInt(sc.next());
        String choiceStr;
        switch (choice) {
            case 1:
                System.out.println("-- Danh sách điện thoại --");
                outputAllPhone();
                System.out.println("Bạn có muốn tiếp tục thao tác không?(Y/N)");
                choiceStr = sc.next();
                if (choiceStr.equalsIgnoreCase("Y")) {
                    showPhone();
                } else if (choiceStr.equalsIgnoreCase("N")) {
                    System.out.println("Kết thúc chương trình.");
                } else {
                    System.out.println("Chức năng không tồn tại.");
                }
                break;
            case 2:
                System.out.println("-- Danh sách điện thoại cũ --");
                System.out.println("ID\t|Tên\t|Hãng\t|Giá\t|Bảo hành");
                for (SecondHandPhone secondHandPhone : secondHandPhones) {
                    secondHandPhone.outputPhone();
                }
                System.out.println("Bạn có muốn tiếp tục thao tác không?(Y/N)");
                choiceStr = sc.next();
                if (choiceStr.equalsIgnoreCase("Y")) {
                    showPhone();
                } else if (choiceStr.equalsIgnoreCase("N")) {
                    System.out.println("Kết thúc chương trình.");
                } else {
                    System.out.println("Chức năng không tồn tại.");
                }
                break;
            case 3:
                System.out.println("-- Danh sách điện thoại mới --");
                System.out.println("ID\t|Tên\t|Hãng\t|Giá\t|Bảo hành");
                for (NewPhone newPhone : newPhones) {
                    newPhone.outputPhone();
                }
                System.out.println("Bạn có muốn tiếp tục thao tác không?(Y/N)");
                choiceStr = sc.next();
                if (choiceStr.equalsIgnoreCase("Y")) {
                    showPhone();
                } else if (choiceStr.equalsIgnoreCase("N")) {
                    System.out.println("Kết thúc chương trình.");
                } else {
                    System.out.println("Chức năng không tồn tại.");
                }
                break;
            case 4:
                guiMain();
                break;
            default:
                System.out.println("Chức năng không tồn tại.");
        }
    }

    public void addPhone() {
        System.out.println("-- Thêm điện thoại --");
        System.out.println("1. Điện thoại cũ.");
        System.out.println("2. Điện thoại mới.");
        System.out.println("3. Quay lại.");
        System.out.print("Chọn chức năng: ");
        choice = Integer.parseInt(sc.next());
        switch (choice) {
            case 1:
                secondHandPhones.add(new SecondHandPhone());
                secondHandPhones.get(n).inputPhone();
                n++;
                addPhone();
                break;
            case 2:
                newPhones.add(new NewPhone());
                newPhones.get(m).inputPhone();
                m++;
                addPhone();
                break;
            case 3:
                guiMain();
                break;
            default:
                System.out.println("Chức năng không tồn tại.");
        }
    }

    public void sortPhone() {
        System.out.println("-- Sắp xếp theo giá --");
        System.out.println("1. Sắp xếp tăng dần.");
        System.out.println("2. Sắp xếp giảm dần.");
        System.out.println("3. Quay lại.");
        System.out.print("Chọn chức năng: ");
        choice = Integer.parseInt(sc.next());
        switch (choice) {
            case 1:
                //Sắp xếp tăng dần
                break;
            case 2:
                //Sắp xếp giảm dần
                break;
            case 3:
                guiMain();
                //Quay lại
                break;
            default:
                System.out.println("Chức năng không tồn tại.");
        }
    }

    public void searchPhone() {
        System.out.println("-- Tìm kiếm điện thoại --");
        System.out.println("1. Tìm kiếm tất cả các loại điện thoại.");
        System.out.println("2. Tìm kiếm điện thoại cũ.");
        System.out.println("3. Tìm kiếm điện thoại mới.");
        System.out.println("4. Quay lại..");
        System.out.print("Chọn chức năng: ");
        choice = Integer.parseInt(sc.next());
        switch (choice) {
            case 1:
                findPhone();
                break;
            case 2:
                findSecondHandPhone();
                break;
            case 3:
                findNewPhone();
                break;
            case 4:
                guiMain();
                //Quay lại
                break;
            default:
                System.out.println("Chức năng không tồn tại.");
        }
    }

    public void findPhone() {
        System.out.println("-- Tìm kiếm điện thoại --");
        System.out.println("1. Tìm kiếm theo giá.");
        System.out.println("2. Tìm kiếm theo tên.");
        System.out.println("3. Tìm kiếm theo hãng.");
        System.out.println("4. Quay lại.");
        System.out.print("Chọn chức năng: ");
        choice = Integer.parseInt(sc.next());
        switch (choice) {
            case 1:
                searchByPrice();
                break;
            case 2:
                searchByName();
                break;
            case 3:
                searchByBrand();
                break;
            case 4:
                searchPhone();
                //Quay lại
                break;
            default:
                System.out.println("Chức năng không tồn tại.");
        }
    }

    public void findSecondHandPhone() {
        System.out.println("-- Tìm kiếm điện thoại cũ --");
        System.out.println("1. Tìm kiếm theo giá.");
        System.out.println("2. Tìm kiếm theo tên.");
        System.out.println("3. Tìm kiếm theo hãng.");
        System.out.println("4. Quay lại.");
        System.out.print("Chọn chức năng: ");
        choice = Integer.parseInt(sc.next());
        switch (choice) {
            case 1:
                searchByPrice();
                break;
            case 2:
                searchByName();
                break;
            case 3:
                searchByBrand();
                break;
            case 4:
                searchPhone();
                //Quay lại
                break;
            default:
                System.out.println("Chức năng không tồn tại.");
        }
    }

    public void findNewPhone() {
        System.out.println("-- Tìm kiếm điện thoại mới --");
        System.out.println("1. Tìm kiếm theo giá.");
        System.out.println("2. Tìm kiếm theo tên.");
        System.out.println("3. Tìm kiếm theo hãng.");
        System.out.println("4. Quay lại.");
        System.out.print("Chọn chức năng: ");
        choice = Integer.parseInt(sc.next());
        switch (choice) {
            case 1:
                searchByPrice();
                break;
            case 2:
                searchByName();
                break;
            case 3:
                searchByBrand();
                break;
            case 4:
                searchPhone();
                //Quay lại
                break;
            default:
                System.out.println("Chức năng không tồn tại.");
        }
    }

    public void searchByPrice() {
        double from, to;
        do {
            System.out.println("-- Tìm kiếm theo giá --");
            System.out.print("Từ: ");
            from = Double.parseDouble(sc.next());
            System.out.print("Đến: ");
            to = Double.parseDouble(sc.next());
            if (from < 0 || to < 0) {
                System.out.println("Giá không hợp lệ, vui lòng nhập lại giá.");
            }
        } while (from < 0 || to < 0);
    }

    public void searchByName() {
        String name;
        System.out.println("-- Tìm kiếm theo tên --");
        System.out.print("Nhập tên điện thoại: ");
        name = sc.next();
    }

    public void searchByBrand() {
        String brand;
        System.out.println("-- Tìm kiếm theo hãng --");
        System.out.print("Nhập hãng điện thoại: ");
        brand = sc.next();
    }
}
