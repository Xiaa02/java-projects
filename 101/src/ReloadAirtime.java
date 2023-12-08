import java.util.Scanner;

public class ReloadAirtime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            String input = s.nextLine();
            if (input.equals("*")) {
                break;
            }

            boolean isValid = isValidReloadCode(input);
            System.out.println("Case #" + caseNumber + ": " + (isValid ? "Valid" : "Invalid"));
            caseNumber++;
        }

        s.close();
    }

    public static boolean isValidReloadCode(String code) {
        return code.matches("\\*122\\*\\d{8}#");
    }
}
