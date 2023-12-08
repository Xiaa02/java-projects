import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Read the number of test cases
        int N = s.nextInt();
        
        for (int caseNumber = 1; caseNumber <= N; caseNumber++) {
            // Read the time in seconds for each test case
            int timeInSeconds = s.nextInt();
            
            // Convert time to hours, minutes, and seconds
            int hours = timeInSeconds / 3600;
            int remainingSeconds = timeInSeconds % 3600;
            int minutes = remainingSeconds / 60;
            int seconds = remainingSeconds % 60;
            
            // Print the result in the specified format
            System.out.printf("Case #%d: %d:%d:%d%n", caseNumber, hours, minutes, seconds);
        }
        
        s.close();
    }
}
