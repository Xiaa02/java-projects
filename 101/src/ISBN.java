import java.util.Scanner;

public class ISBN {
    // Function to calculate the ISBN-10 check digit
    public static int calculateCheckDigit(int[] isbn) {
        int total = 0;
        for (int i = 0; i < 9; i++) {
            total += isbn[i] * (10 - i);
        }
        int checkDigit = (11 - (total % 11)) % 11;
        return checkDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading n

        for (int caseNum = 1; caseNum <= n; caseNum++) {
            String input = scanner.nextLine();
            int[] isbn = new int[10];
            for (int i = 0; i < 10; i++) {
                isbn[i] = Character.getNumericValue(input.charAt(i));
            }

            int checkDigit = calculateCheckDigit(isbn);
            System.out.println("Case #" + caseNum + ": " + checkDigit);
        }

        scanner.close();
    }
}












