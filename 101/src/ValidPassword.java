import java.util.Scanner;

public class ValidPassword {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            String password = s.next();
            if (password.equals("#")) {
                break;
            }
            
            boolean isValidPassword = true;
            if (password.length() < 6) {
                isValidPassword = false;
            } else {
                for (char c : password.toCharArray()) {
                    if (!Character.isLowerCase(c) && !Character.isDigit(c)) {
                        isValidPassword = false;
                        break;
                    }
                }
            }
            
            String result = isValidPassword ? "valid" : "invalid";
            System.out.println("Case #" + caseNumber + ": " + result);
            caseNumber++;
        }

        s.close();
    }
}
