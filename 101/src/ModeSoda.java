import java.util.Scanner;

public class ModeSoda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                break;
            }

            int[] totalScores = new int[4];
            int[] respondentCount = new int[4];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 4; j++) {
                    int score = s.nextInt();
                    totalScores[j] += score;
                    respondentCount[j]++;
                }
            }

            System.out.println("Case #" + caseNumber + ":");

            for (int i = 0; i < 4; i++) {
                double average = (double) totalScores[i] / respondentCount[i];
                System.out.printf("Soda-%d: %.2f%n", i + 1, average);
            }

            caseNumber++;
        }
    }
}
