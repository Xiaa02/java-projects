import java.util.Scanner;

public class RunForHealth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Number of test cases

        for (int caseNumber = 1; caseNumber <= n; caseNumber++) {
            int days = s.nextInt(); // Number of days Johan runs
            double[] runningTimes = new double[days];

            // Read the running times for each day
            for (int i = 0; i < days; i++) {
                runningTimes[i] = s.nextDouble();
            }

            // Find the best and second-best running times
            double bestTime = Double.MAX_VALUE;
            double secondBestTime = Double.MAX_VALUE;

            for (double time : runningTimes) {
                if (time < bestTime) {
                    secondBestTime = bestTime;
                    bestTime = time;
                } else if (time < secondBestTime) {
                    secondBestTime = time;
                }
            }

            // Print the result for this test case
            System.out.printf("Case #%d: %.2f %.2f%n", caseNumber, bestTime, days > 1 ? secondBestTime : bestTime);
        }

        s.close();
    }
}
