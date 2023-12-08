import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt(); // Number of input cases
        
        for (int caseNumber = 1; caseNumber <= N; caseNumber++) {
            int decimalNumber = s.nextInt();
            
            StringBuilder binary = new StringBuilder();
        
            if (decimalNumber == 0) {
                binary.append("0");
            } else {
                while (decimalNumber > 0) {
                    int remainder = decimalNumber % 2;
                    binary.insert(0, remainder);
                    decimalNumber /= 2;
                }
            }
            
            System.out.printf("Case #%d: %s%n", caseNumber, binary.toString());
        }
    }
}
