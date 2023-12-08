import java.util.Scanner;

public class AlternatingSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int caseNumber = 1;
        
        while (true) {
            int num = s.nextInt();
            
            // Check for the end of input
            if (num == -1) {
                break;
            }
            
            int altSum = 0;
            int sign = 1;  // Initialize the sign as positive for the first number
            
            for (int i = 1; i <= num; i++) {
                altSum += sign * i;
                sign *= -1;  // Change the sign for the next number
            }
            
            // Print the result in the specified format
            System.out.printf("Case #%d: %d%n", caseNumber, altSum);
            
            // Increment the case number
            caseNumber++;
        }
        
        s.close();
    }
}
