package logicexercises01.exercise12;

import java.util.Scanner;

// Create an algorithm that reads the value of a product and determines the
// amount to be paid according to the payment method chosen by the buyer, and
// prints the final value of the product to be paid on the screen. Use the codes from
// the payment conditions table to perform the appropriate calculation.
public class ProductPayment {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double productPrice;
        char command;

        System.out.print("Product price: ");
        productPrice = userInput.nextDouble();
        userInput.nextLine();

        System.out.println();
        System.out.println("Choose the method of payment:");
        System.out.println("1. Cash or pix (15% discount)");
        System.out.println("2. Credit card 1x (10% discount)");
        System.out.println("3. Credit card 2x (Normal price)");
        System.out.println("4. Credit card 3x or more (10% interest)");
        System.out.print("> ");
        command = userInput.nextLine().charAt(0);

        switch (command) {
            case '1':
                double discountCashOrPix = productPrice * 0.15;
                productPrice -= discountCashOrPix;
                showFinalPrice(productPrice);
                break;
            case '2':
                double discountCreditCard = productPrice * 0.10;
                productPrice -= discountCreditCard;
                showFinalPrice(productPrice);
                break;
            case '3':
                showFinalPrice(productPrice);
                break;
            case '4':
                double interestCreditCard3xOrMore = productPrice * 0.10;
                productPrice += interestCreditCard3xOrMore;
                showFinalPrice(productPrice);
                break;
        }

    }

    private static void showFinalPrice(double productPrice) {
        System.out.println();
        System.out.println("Final price: " + productPrice);
    }

}
