import java.util.Scanner;

public class QuadrantIdentifier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Read the number of points
        int N = s.nextInt();

        // Initialize an array to store the results
        String[] results = new String[N];

        // Iterate through each point
        for (int i = 0; i < N; i++) {
            int x = s.nextInt();
            int y = s.nextInt();

            // Check which quadrant or axis the point belongs to
            if (x == 0 || y == 0) {
                results[i] = "AXIS";
            } else if (x > 0 && y > 0) {
                results[i] = "Q1";
            } else if (x < 0 && y > 0) {
                results[i] = "Q2";
            } else if (x < 0 && y < 0) {
                results[i] = "Q3";
            } else {
                results[i] = "Q4";
            }
        }

        // Print the results
        for (int i = 0; i < N; i++) {
            System.out.println("Case #" + (i + 1) + ": " + results[i]);
        }
        s.close();
    }
}

