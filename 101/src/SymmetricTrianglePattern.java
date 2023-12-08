import java.util.Scanner;

public class SymmetricTrianglePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input the number of test cases
        int n = s.nextInt();

        for (int caseNumber = 1; caseNumber <= n; caseNumber++) {
            int a = s.nextInt();
            printSymmetricTrianglesPattern(caseNumber, a);
        }

        s.close();
    }

    public static void printSymmetricTrianglesPattern(int caseNumber, int a) {
        System.out.println("Case #" + caseNumber + ":");

        // Print the pattern
        for (int i = 1; i <= a; i++) {
            // Print the left side
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Print the space in the middle
            for (int j = 1; j <= 2 * (a - i); j++) {
                System.out.print("  ");
            }

            // Print the right side
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
