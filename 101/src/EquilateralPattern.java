import java.util.Scanner;

public class EquilateralPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); // Number of test cases

        for (int loop = 0; loop < N; loop++) {  // Loop through each test case
            int size = s.nextInt(); // Size of the triangle pattern

            for (int i = 1; i <= size; i++) {  // Loop through each row of the triangle
                for (int j = 0; j < size - i; j++) {  // Print spaces before the stars
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i - 1; k++) {  // Print stars for each row
                    System.out.print("*");
                }
                System.out.println();  // Move to the next line after each row
            }
            
        //    if (loop < N - 1) {
        //        System.out.println(); // Print an empty line between test cases
        //    }
        }

        s.close();
    }
}