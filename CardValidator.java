import java.util.Scanner;

public class CardValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        String cardNumber = input.nextLine();
        System.out.println("You entered: " + cardNumber);
        if (cardNumber.length() != 16) {
            System.out.println("Invalid card number");
            return;
        }
        for (int i = 0; i < cardNumber.length(); i++) {
            if (!Character.isDigit(cardNumber.charAt(i))) {
                System.out.println("Invalid card number");
                return;
            }
        }
        if (cardNumber.charAt(0) == '4') {
            System.out.println("Visa card");
        }
        else if (cardNumber.charAt(0) == '5') {
            System.out.println("Mastercard");
        }
        else if (cardNumber.charAt(0) == '2') {
            System.out.println("Mastercard (digital)");
        }
        else if (cardNumber.charAt(0) == '3') {
            System.out.println("American Express");
        }
        else if (cardNumber.charAt(0) == '6') {
            System.out.println("Discover");
        }
        else {
            System.out.println("Unknown card");
        }
    }
}
