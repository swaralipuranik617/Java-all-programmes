import java.util.Scanner;

class LicenseException extends Exception {
    public LicenseException(String message) {
        super(message);
    }
}

public class DrivingLicense {

    static void checkAge(int age) throws LicenseException {
        if (age < 18) {
            throw new LicenseException("You are not eligible for a driving license.");
        } else {
            System.out.println("You are eligible for a driving license.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (LicenseException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}