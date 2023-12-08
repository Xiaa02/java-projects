import java.util.Scanner;

//Your program will be evaluated by this DriverMain class and several test cases.

public class ParkingRate {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt(); //test case
        
        for (int i = 1; i <= n; i++) {
            double startTime = s.nextDouble();
            double endTime = s.nextDouble();
            double parkingHours = endTime - startTime;
            
            double charge = calculateCharge(parkingHours);
            System.out.printf("Case #%d: RM%.2f%n", i, charge);
        }
        
        s.close();
    }
    
    public static double calculateCharge(double hours) {
        double minFee = 3.00;
        double hourlyRate = 0.50;
        double maxDailyCharge = 10.00;
        double maxHours = 3.0;
        
        if (hours <= maxHours) {
            return minFee;
        } else {
            double extraHours = hours - maxHours;
            double extraCharge = extraHours * hourlyRate;
            return Math.min(extraCharge + minFee, maxDailyCharge);
        }
    }
}
// public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt(); //test case

//        for (int i = 1; i <= n; i++) {
//            double startTime = s.nextDouble();
//            double endTime = s.nextDouble();
//            double parkingHours = endTime - startTime;

//           double minFee = 3.00;
//            double hourlyRate = 0.50;
//            double maxDailyCharge = 10.00;
//           double maxHours = 3.0;

//           double charge;
//            if (parkingHours <= maxHours) {
//                charge = minFee;
//            } else {
//                double extraHours = parkingHours - maxHours;
//               double extraCharge = extraHours * hourlyRate;
//                charge = Math.min(extraCharge + minFee, maxDailyCharge);
//           }
//            System.out.printf("Case #%d: RM%.2f%n", i, charge);
//        }

//       s.close();
//    }
//}