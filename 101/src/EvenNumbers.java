import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();  // Number of test cases

        for (int caseNumber = 1; caseNumber <= t; caseNumber++) {
            int N;
            int evenCount = 0; //Counting the even numbers

            while (true) {
                N = s.nextInt();

                if (N == -1) {
                    break;
                }

                if (N % 2 == 0) {
                    evenCount++;
                }
            }

            System.out.println("Case #" + caseNumber + ": " + evenCount);  // Print count of even numbers for the case
        }

        s.close();
    }
}




