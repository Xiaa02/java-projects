import java.util.Scanner;

public class SelfStudy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                break;
            }

            int totalStudentsOver25 = 0;
            int[] totalStudyHours = new int[n];

            for (int i = 0; i < n; i++) {
                int weeklyTotal = 0;
                for (int j = 0; j < 7; j++) {
                    int dailyStudyHours = s.nextInt();
                    weeklyTotal += dailyStudyHours;
                }
                totalStudyHours[i] = weeklyTotal;

                if (weeklyTotal > 25) {
                    totalStudentsOver25++;
                }
            }

            double percentageOver25 = (double) totalStudentsOver25 / n * 100;

            System.out.printf("Case #%d: %.2f%%%n", caseNumber, percentageOver25);

            for (int i = 0; i < n; i++) {
                System.out.printf("Student %d: %d%n", i + 1, totalStudyHours[i]);
            }

            caseNumber++;
        }
    }
}
