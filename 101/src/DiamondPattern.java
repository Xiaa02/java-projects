import java.util.Scanner;

public class DiamondPattern {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // Number of test cases

        for (int t = 1; t <= n; t++) {
            int a = s.nextInt(); // Dimension of the pattern

            System.out.println("Case " + t + ":");

            // Print the upper half of the diamond
            for (int i = 1; i <= a; i++) {
                // Print spaces for the left side of the diamond
                for (int j = 1; j <= a - i; j++) {
                    System.out.print(" ");
                }

                // Print stars for the left side of the diamond
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }

            // Print the lower half of the diamond (excluding the middle row for odd dimensions)
            for (int i = a - 1; i >= 1; i--) {
                // Print spaces for the left side of the diamond
                for (int j = 1; j <= a - i; j++) {
                    System.out.print(" ");
                }

                // Print stars for the left side of the diamond
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println( );
            }
        }

        s.close();
    }
}
