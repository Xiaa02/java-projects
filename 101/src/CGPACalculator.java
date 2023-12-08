import java.util.Scanner;

public class CGPACalculator {
    static final int MAX_SEMESTERS = 10;
    static final int MAX_SUBJECTS = 10;

    // Define grade and grade point arrays
    static final String[] GRADES = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E"};
    static final double[] GRADE_POINTS = {4.00, 3.67, 3.33, 3.00, 2.67, 2.33, 2.00, 1.67, 1.33, 1.00, 0.00};

    // Define a class to represent a semester
    static class Semester {
        int numSubjects;
        int[] credits;
        int[] marks;

        Semester(int numSubjects) {
            this.numSubjects = numSubjects;
            credits = new int[numSubjects];
            marks = new int[numSubjects];
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numSemesters = s.nextInt();
        s.nextLine(); // Consume the newline

        // Loop through each semester
        for (int semesterNum = 1; semesterNum <= numSemesters; semesterNum++) {
            int numSubjects = s.nextInt();
            Semester semester = new Semester(numSubjects);

            // Input credits and marks for each subject
            for (int i = 0; i < numSubjects; i++) {
                semester.credits[i] = s.nextInt();
                semester.marks[i] = s.nextInt();
            }

            // Calculate and print GPA for the semester
            calculateAndPrintGPA(semesterNum, semester);
        }
    }

    // Calculate and print GPA for a semester
    static void calculateAndPrintGPA(int semesterNum, Semester semester) {
        double totalGradePoints = 0.0;
        int totalCredits = 0;
        int creditFail = 0;

        System.out.print("Semester #" + semesterNum + ": ");

        // Loop through each subject in the semester
        for (int i = 0; i < semester.numSubjects; i++) {
            String grade = getGrade(semester.marks[i]);
            double gradePoint = getGradePoint(grade);

            if (grade.equals("E")) {
                creditFail += semester.credits[i];
            }

            totalGradePoints += gradePoint * semester.credits[i];
            totalCredits += semester.credits[i];

            System.out.print(semester.credits[i] + " " + grade + " ");
        }

        // Calculate GPA and CGPA for the semester
        double GPA = totalCredits != 0 ? totalGradePoints / totalCredits : 0.0;
        double CGPA = totalCredits != 0 ? (totalGradePoints + CGPACalculator.totalGradePoints) / (totalCredits + CGPACalculator.totalCredits) : 0.0;

        CGPACalculator.totalGradePoints += totalGradePoints;
        CGPACalculator.totalCredits += totalCredits;

        // Print semester's results with newlines
        System.out.println("\nCredit Fail: " + creditFail);
        System.out.println("Current Credit: " + totalCredits);
        System.out.println("Cumulative Credit: " + CGPACalculator.totalCredits);
        System.out.println("GPA: " + String.format("%.2f", GPA));
        System.out.println("CGPA: " + String.format("%.2f", CGPA));
        System.out.println(); // Add a newline after each semester's output
    }

    static double totalGradePoints = 0.0;
    static int totalCredits = 0;

    // Get the grade based on marks
    static String getGrade(int marks) {
        if (marks >= 80) return "A";
        else if (marks >= 75) return "A-";
        else if (marks >= 70) return "B+";
        else if (marks >= 65) return "B";
        else if (marks >= 60) return "B-";
        else if (marks >= 55) return "C+";
        else if (marks >= 50) return "C";
        else if (marks >= 45) return "C-";
        else if (marks >= 40) return "D+";
        else if (marks >= 35) return "D";
        else return "E";
    }

    // Get the grade point for a given grade
    static double getGradePoint(String grade) {
        for (int i = 0; i < GRADES.length; i++) {
            if (grade.equals(GRADES[i])) {
                return GRADE_POINTS[i];
            }
        }
        return 0.0; // Default grade point for 'E' or any other unrecognized grade
    }
}