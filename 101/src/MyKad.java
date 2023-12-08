import java.util.Scanner;

public class MyKad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();  // Number of test cases

        for (int caseNumber = 1; caseNumber <= N; caseNumber++) {
            int X = s.nextInt();  // Number of students
            int numMale = 0;
            int numFemale = 0;

            for (int i = 0; i < X; i++) {
                int G = s.nextInt();  // Last 4 digits of MyKad number
                
                // Determine gender based on the last digit
                if (G % 2 == 0) {
                    numFemale++;
                } else {
                    numMale++;
                }
            }

            System.out.println("Case #" + caseNumber + ": " + numMale + " M " + numFemale + " F");
        }

        s.close();
    }
}

