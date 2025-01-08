package phone_management.validation;

import phone_management.exception.EmptyFieldException;
import phone_management.exception.MinLengthException;
import phone_management.exception.NegativeNumberException;
import phone_management.exception.NumberOutOfRangerException;

public class CommonValidation {
    public static void checkEmptyField(String value, String fieldName) throws EmptyFieldException {
        if (value.isEmpty()) {
            throw new EmptyFieldException(fieldName + "Không được rỗng");
        }
    }

    public static int parseInt(String value, String fieldName) throws NumberFormatException {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(fieldName + " phải là số nguyên");
        }
    }

    public static Double parseDouble(String value, String fieldName) throws NumberFormatException {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(fieldName + " phải là số thực");
        }
    }

    public static void checkMinLength(String value, int minLength, String fieldName) throws MinLengthException {
        if (value.length() < minLength) {
            throw new MinLengthException(fieldName + " phải có ít nhất " + minLength + " ký tự");
        }
    }

    public static void checkNegativeNumber(double value, String fieldName) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException(fieldName + " không được âm");
        }
    }

    public static void checkNumberOutOfRanger(int value, int min, int max, String fieldName) throws NumberOutOfRangerException {
        if (value < min || value > max) {
            throw new NumberOutOfRangerException(fieldName + " phải nằm trong khoảng từ " + min + " đến " + max);
        }
    }
}
