import java.util.Scanner;

public class AboveAverage {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Number of test cases

        for (int i = 1; i <= n; i++) {
            int[] scores = new int[100]; // Assuming maximum 100 students
            int numStudents = 0;
            int sum = 0;

            while (true) {
                int score = s.nextInt();
                if (score == -1) {
                    break;
                }
                scores[numStudents] = score;
                sum += score;
                numStudents++;
            }

            int average = Math.round((float) sum / numStudents);
            int aboveAverage = 0;

            for (int j = 0; j < numStudents; j++) {
                if (scores[j] > average) {
                    aboveAverage++;
                }
            }

            int percentageAbove = Math.round((float) aboveAverage * 100 / numStudents);

            System.out.println("Case #" + i + ": " + average + " " + percentageAbove + "%");
        }
    }
}
