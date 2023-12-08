import java.util.Scanner;

public class P1SemesterGrade {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner s = new Scanner(System.in);
        
        // Read the number of semesters
        int n = s.nextInt();
        s.nextLine(); // Consume the newline character

        // Iterate through each semester
        for (int semester = 1; semester <= n; semester++) {
            // Read the data for this semester and split it into an array
            String[] data = s.nextLine().split(" ");
            
            // Get the number of subjects for this semester
            int numSubjects = Integer.parseInt(data[0]);
            
            // Create an array to store the marks for each subject
            double[] marks = new double[numSubjects];
            
            // Initialize the total credits for this semester
            int totalCredits = 0;

            // Print the semester header
            System.out.print("Semester #" + semester + ": ");

            // Iterate through each subject's data
            for (int i = 1; i < data.length; i += 2) {
                // Get the credits for the current subject
                int credits = Integer.parseInt(data[i]); // Credits are at even indices
                
                // Add the credits to the total for this semester
                totalCredits += credits;
                
                // Get the marks for the current subject
                marks[i / 2] = Double.parseDouble(data[i + 1]); // Marks are at odd indices
                
                // Calculate and print the grade for the current subject
                String grade = calculateGrade(marks[i / 2]);
                System.out.print(grade + " ");
            }

            // Print the total credits for this semester
            System.out.println(totalCredits);
        }
    }

    // Calculate the grade based on total marks
    public static String calculateGrade(double totalMarks) {
        if (totalMarks >= 80) return "A";
        else if (totalMarks >= 75) return "A-";
        else if (totalMarks >= 70) return "B+";
        else if (totalMarks >= 65) return "B";
        else if (totalMarks >= 60) return "B-";
        else if (totalMarks >= 55) return "C+";
        else if (totalMarks >= 50) return "C";
        else if (totalMarks >= 45) return "C-";
        else if (totalMarks >= 40) return "D+";
        else if (totalMarks >= 35) return "D";
        else return "E";
    }
}