import java.util.Scanner;

//Your program will be evaluated by this DriverMain class and several test cases.

public class KopiMalam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Number of test cases

        for (int caseNum = 1; caseNum <= n; caseNum++) {
            double totalPrice = 0.0;
            boolean applyDeliveryFee = true;

            while (true) {
                int foodNumber = s.nextInt();
                int quantity = s.nextInt();

                if (foodNumber == 0 && quantity == 0) {
                    break;
                }

                double price = 0.0;
                if (foodNumber == 1) {
                    price = 3.50;
                } else if (foodNumber == 2) {
                    price = 3.00;
                } else if (foodNumber == 3) {
                    price = 3.80;
                } else if (foodNumber == 4) {
                    price = 3.50;
                } else if (foodNumber == 5 || foodNumber == 6) {
                    price = 2.00;
                }

                price *= quantity;
                totalPrice += price;

                if (totalPrice >= 20.0) {
                    applyDeliveryFee = false;
                }
            }

            // Apply delivery charge waiver if applicable
            if (applyDeliveryFee && totalPrice > 0.0) {
                totalPrice += 5.0;
            }

            System.out.printf("Case #%d: RM%.2f%n", caseNum, totalPrice);
        }

        s.close();
    }
}