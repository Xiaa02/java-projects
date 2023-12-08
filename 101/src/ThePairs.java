import java.util.Scanner;

public class ThePairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                break;
            }

            int[][] table = new int[n][n];

            // Read the table
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    table[i][j] = s.nextInt();
                }
            }

            System.out.println("Case #" + caseNumber + ": ");
            findIntersectionPairs(table);
            caseNumber++;
        }

        s.close();
    }

    private static void findIntersectionPairs(int[][] table) {
        int n = table.length;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (table[i][j] == 1 && table[j][i] == 1) {
                    System.out.printf("[%d,%d][%d,%d]\n", i, j, j, i);
                }
            }
        }
    }
}