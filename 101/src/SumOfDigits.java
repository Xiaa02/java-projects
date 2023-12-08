import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); // Number of test cases
        
        for (int caseNumber = 1; caseNumber <= N; caseNumber++) {
            int num = s.nextInt();
            int sum = 0;
            
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            System.out.printf("Case #%d: %d%n", caseNumber, sum);
        }
    }
}
