import java.util.Scanner;

public class ForwardAndBackward {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int caseNumber = 1;
        
        while (true) {
            int num = s.nextInt();
            
            // Check for the end of input
            if (num == -1) {
                break;
            }
            
            int originalNum = num;
            int reversedNum = 0;
            
            while (num > 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }
            
            // Check if it's a palindrome and print the result
            if (originalNum == reversedNum) {
                System.out.printf("Case #%d: Yes%n", caseNumber);
            } else {
                System.out.printf("Case #%d: No%n", caseNumber);
            }
            
            // Increment the case number
            caseNumber++;
        }
        
        s.close();
    }
}
