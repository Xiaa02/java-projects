import java.util.Scanner;

public class X4CPhoneNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // Read the number of test cases
        s.nextLine();

        // Process each test case and print the corresponding phone number
        for (int testCase = 1; testCase <= n; testCase++) {
            String expression = s.nextLine();
            StringBuilder phoneNum = new StringBuilder();

            // Convert the expression to phone number
            for (char character : expression.toCharArray()) {
                if (Character.isLetter(character)) {
                    char convertedChar = convertLetterToNumber(character); // Convert letter to number
                    phoneNum.append(convertedChar);
                } else if (Character.isDigit(character) || character == '-') {
                    phoneNum.append(character); // Keep digits and hyphens as they are
                }
            }

            // Print the result
            System.out.print("Case #" + testCase + ": " + phoneNum.toString());

            // Print a newline after each test case
            if (testCase < n) {
                System.out.println();
            }
        }

        s.close();
    }

    // To convert a letter to its corresponding number
    private static char convertLetterToNumber(char letter) {
        if (letter >= 'A' && letter <= 'C') return '2';
        if (letter >= 'D' && letter <= 'F') return '3';
        if (letter >= 'G' && letter <= 'I') return '4';
        if (letter >= 'J' && letter <= 'L') return '5';
        if (letter >= 'M' && letter <= 'O') return '6';
        if (letter >= 'P' && letter <= 'S') return '7';
        if (letter >= 'T' && letter <= 'V') return '8';
        if (letter >= 'W' && letter <= 'Z') return '9';
        return letter; // If the character is not a letter, return it as is
    }
}
