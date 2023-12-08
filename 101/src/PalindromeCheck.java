import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        s.nextLine(); // Consume the newline after reading the integer

        for (int caseNumber = 1; caseNumber <= testCases; caseNumber++) {
            String input = s.nextLine();
            String reversed = new StringBuilder(input).reverse().toString();

            String result = input.equalsIgnoreCase(reversed) ? "Yes" : "No";
            System.out.println("Case #" + caseNumber + ": " + result);
        }

        s.close();
    }
}