import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNum = 1;

        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                break;
            }

            // Read the correct answer (key)
            String key = s.next();

            // Create a 2D array to store student answers
            String[][] studentAnswers = new String[n][key.length()];

            System.out.println("Case #" + caseNum + ":");

            // Read and store the student answers
            for (int i = 0; i < n; i++) {
                studentAnswers[i] = s.next().split(""); // Split the answer string into an array of characters
            }

            for (int i = 0; i < n; i++) {
                double score = 0;

                for (int j = 0; j < key.length(); j++) {
                    if (key.charAt(j) == studentAnswers[i][j].charAt(0)) {
                        score += 1.0;
                    } else {
                        score -= 0.25;
                    }
                }

                // Ensure the score is non-negative
                if (score < 0) {
                    score = 0;
                }

                System.out.printf("Student %d: %.2f%n", i + 1, score);
            }

            caseNum++;
        }
    }
}
