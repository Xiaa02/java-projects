import java.util.Scanner;

public class BelalangMessageEncoder {
    public static String encodeMessage(String message) {
        StringBuilder encodedMessage = new StringBuilder();
        for (char ch : message.toCharArray()) {
            if (ch == ' ') {
                encodedMessage.append(' ');
            } else {
                char encodedChar = (char) ('z' - (ch - 'a'));
                encodedMessage.append(encodedChar);
            }
        }
        return encodedMessage.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int caseNumber = 1; caseNumber <= n; caseNumber++) {
            String message = scanner.nextLine();
            String encodedMessage = encodeMessage(message);
            System.out.println("Case #" + caseNumber + ": " + encodedMessage);
        }
    }
}
