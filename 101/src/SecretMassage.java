import java.util.Scanner;

public class SecretMassage {
    public static String caesarCipher(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                encryptedText.append((char) (((c - 'A' + shift) % 26) + 'A'));
            } else if (c >= 'a' && c <= 'z') {
                encryptedText.append((char) (((c - 'a' + shift) % 26) + 'a'));
            } else if (c >= '0' && c <= '9') {
                encryptedText.append((char) (((c - '0' + shift) % 10) + '0'));
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            String line = scanner.nextLine().trim();
            if (line.equals("#")) {
                break;
            }

            String encryptedLine = caesarCipher(line, 1);
            System.out.println("Case #" + caseNumber + ": " + encryptedLine);
            caseNumber++;
        }
    }
}
