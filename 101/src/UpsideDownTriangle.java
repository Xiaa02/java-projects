import java.util.Scanner;

public class UpsideDownTriangle {
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
        System.out.println("Case #" + caseNumber + ": ");

        for (int i = a; i >= 1; i--) {
            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

                if (j != 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

