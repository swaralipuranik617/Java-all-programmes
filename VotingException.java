import java.util.Scanner;

class VotingException extends Exception {
    public VotingException(String message) {
        super(message);
    }
}

public class VotingSystem {

    static void checkAge(int age) throws VotingException {
        if (age < 18) {
            throw new VotingException("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (VotingException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}