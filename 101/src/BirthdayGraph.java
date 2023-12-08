import java.util.Scanner;

public class BirthdayGraph {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            int n = s.nextInt(); // Number of birthdates
            if (n == 0) {
                break;
            }

            int[] counts = new int[12]; // Array to store counts for each month

            for (int i = 0; i < n; i++) {
                int day = s.nextInt();
                int month = s.nextInt();
                int year = s.nextInt();

                counts[month - 1]++;
            }

            System.out.println("Case #" + caseNumber + ":");
            String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
            for (int i = 0; i < 12; i++) {
                System.out.print(monthNames[i] + ":");
                for (int j = 0; j < counts[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            caseNumber++;
        }
    }
}
