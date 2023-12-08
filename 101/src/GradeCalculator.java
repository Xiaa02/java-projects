import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); // Number of semesters

        for (int semester = 1; semester <= N; semester++) {
            int numSubjects = s.nextInt();
            int[] credits = new int[numSubjects];
            double[] totalMarks = new double[numSubjects];

            for (int i = 0; i < numSubjects; i++) {
                credits[i] = s.nextInt();
                totalMarks[i] = s.nextDouble();
            }

            System.out.print("Semester #" + semester + ": ");
            for (int i = 0; i < numSubjects; i++) {
                String grade = calculateGrade(totalMarks[i]);
                System.out.print(grade + " ");
            }
             int totalCredits = calculateTotalCredits(credits);
             System.out.print(totalCredits + " "); // Add a space after totalCredits
             System.out.println(); // Move to the next line
        }

        s.close();
    }

    public static String calculateGrade(double marks) {
        if (marks >= 80.0) {
            return "A";
        } else if (marks >= 75.0) {
            return "A-";
        } else if (marks >= 70.0) {
            return "B+";
        } else if (marks >= 65.0) {
            return "B";
        } else if (marks >= 60.0) {
            return "B-";
        } else if (marks >= 55.0) {
            return "C+";
        } else if (marks >= 50.0) {
            return "C";
        } else if (marks >= 45.0) {
            return "C-";
        } else if (marks >= 40.0) {
            return "D+";
        } else if (marks >= 35.0) {
            return "D";
        } else {
            return "E";
        }
    }

    public static int calculateTotalCredits(int[] credits) {
        int totalCredits = 0;
        for (int credit : credits) {
            totalCredits += credit;
        }
        return totalCredits;
    }
}
