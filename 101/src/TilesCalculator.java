import java.util.Scanner;

public class TilesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of labs

        for (int caseNumber = 1; caseNumber <= N; caseNumber++) {
            int widthMeters = scanner.nextInt(); // Width in meters
            int lengthMeters = scanner.nextInt(); // Length in meters

            // Convert the dimensions to centimeters
            int widthCentimeters = widthMeters * 100;
            int lengthCentimeters = lengthMeters * 100;

            // Calculate the number of tiles needed
            int tilesNeeded = (widthCentimeters / 30) * (lengthCentimeters / 30);

            // Print the result in the specified format
            System.out.printf("Case #%d: %d%n", caseNumber, tilesNeeded);
        }

        scanner.close();
    }
}
