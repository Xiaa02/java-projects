import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input the number of test cases
        int n = s.nextInt();

        for (int caseNumber = 1; caseNumber <= n; caseNumber++) {
            int a = s.nextInt();
            printTrianglePattern(caseNumber, a);
        }

        s.close();
    }

    public static void printTrianglePattern(int caseNumber, int a) {
        System.out.println("Case #" + caseNumber + ":");

        // Print the pattern
        for (int i = 1; i <= a; i++) {
            StringBuilder row = new StringBuilder();

            // Fill the row with '0' and '1' based on the pattern
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    row.append('1');
                } else {
                    row.append('0');
                }
            }

            System.out.println(row.toString());
        }
    }
}
