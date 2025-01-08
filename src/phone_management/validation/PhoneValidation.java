package phone_management.validation;

import java.util.Scanner;

public class PhoneValidation {
    private static final Scanner sc = new Scanner(System.in);

    public static String inputName(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s", fieldName);
                String name = sc.nextLine();

                CommonValidation.checkEmptyField(name, fieldName);

                return name;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
    }

    public static Double inputPrice(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s", fieldName);
                String priceStr = sc.nextLine();

                CommonValidation.checkEmptyField(priceStr, fieldName);
                double price = CommonValidation.parseDouble(priceStr, fieldName);
                CommonValidation.checkNegativeNumber(price, fieldName);

                return price;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
    }

    public static int inputQuantity(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s", fieldName);
                String quantityStr = sc.nextLine();

                CommonValidation.checkEmptyField(quantityStr, fieldName);
                int quantity = CommonValidation.parseInt(quantityStr, fieldName);
                CommonValidation.checkNegativeNumber(quantity, fieldName);

                return quantity;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
    }

    public static String inputBrand(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s", fieldName);
                String brand = sc.nextLine();

                CommonValidation.checkEmptyField(brand, fieldName);

                return brand;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
    }

    public static int inputBatteryCapacity(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s", fieldName);
                String batteryCapacityStr = sc.nextLine();

                CommonValidation.checkEmptyField(batteryCapacityStr, fieldName);
                int batteryCapacity = CommonValidation.parseInt(batteryCapacityStr, fieldName);
                CommonValidation.checkNumberOutOfRanger(batteryCapacity, 0, 100, fieldName);

                return batteryCapacity;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
    }

    public static String inputDescription(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s", fieldName);
                String description = sc.nextLine();

                CommonValidation.checkEmptyField(description, fieldName);

                return description;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
    }

    public static int inputGuarantee(String fieldName) {
        while (true) {
            try {
                System.out.printf("Nhập vào %s", fieldName);
                String guaranteeStr = sc.nextLine();

                CommonValidation.checkEmptyField(guaranteeStr, fieldName);
                int guarantee = CommonValidation.parseInt(guaranteeStr, fieldName);
                CommonValidation.checkNegativeNumber(guarantee, fieldName);

                return guarantee;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
    }
}
