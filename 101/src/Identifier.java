import java.util.Scanner;

public class Identifier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            String input = s.nextLine();
            if (input.equals("#")) {
                break;
            }

            boolean isValid = true;

            if (input.length() == 0 || !Character.isLowerCase(input.charAt(0))) {
                isValid = false;
            } else {
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    if (!Character.isLetterOrDigit(ch) && ch != '_' && ch != '$') {
                        isValid = false;
                        break;
                    }
                }
            }

            String validation = isValid ? "valid" : "invalid";
            System.out.println("Case #" + caseNumber + ": " + validation);

            caseNumber++;
        }

        s.close();
    }
}

