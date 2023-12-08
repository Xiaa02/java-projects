import java.util.Scanner;

//Your program will be evaluated by this DriverMain class and several test cases.

public class X3ACourseRating {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                break; // End of input
            }

            System.out.println("Case #" + caseNumber + ":");
            findMostDifficultCourse(s, n); // Call the method to process and find the most difficult course
            caseNumber++;
        }

        s.close(); // Close the scanner when done reading input
    }

    private static void findMostDifficultCourse(Scanner s, int n) {
        double[] courseRatings = new double[6];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                int rating = s.nextInt();
                courseRatings[j] += rating; // Accumulate the ratings for each course
            }
        }

        int mostDifficultCourse = 1;
        double maxDifficulty = 0.0;

        for (int i = 0; i < 6; i++) {
            double difficulty = courseRatings[i] / n; // Calculate the average difficulty for each course
            System.out.printf("Course %d: %.2f%n", i + 1, difficulty); // Print the course difficulty

            if (difficulty > maxDifficulty) {
                maxDifficulty = difficulty;
                mostDifficultCourse = i + 1; // Update the most difficult course if necessary
            }
        }

    }
}