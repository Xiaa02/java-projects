import java.util.Scanner;

public class X4BHouseCleaningService {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // Input the number of test cases

        for (int i = 1; i <= n; i++) {
            // Input start and end times of parking
            double startTime = s.nextDouble();
            double endTime = s.nextDouble();

            // Calculate the parking charge
            double charge = calculateParkingCharge(startTime, endTime);

            System.out.printf("Case #%d: RM%.2f%n", i, charge); // Output the result
        }
    }

    // To calculate the parking charge for a given duration
    private static double calculateParkingCharge(double startTime, double endTime) {
        // Min charge is RM100 for up to 4 hours
        double minCharge = 100.00;
        // Calculate the duration in hours
        double duration = endTime - startTime;
        // Ensure the min charge is applied for durations less than 4 hours
        if (duration < 4.0) {
            return minCharge;
        }
        // Calculate the charge based on the hourly rate
        double charge = duration * 25.00;
        return Math.max(charge, minCharge);
    }
}
