import java.util.Scanner;

public class X4AInternationalFoodfair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Number of agents
        s.nextLine();

        for (int agentNum = 1; agentNum <= n; agentNum++) {
            String[] couponsStr = s.nextLine().split(" ");
            int[] couponsSold = new int[3]; // Array to store counts for RM5, RM10, and RM20 coupons
            double totalValue = 0;

            // Loop through coupon values for the current agent
            for (String couponStr : couponsStr) {
                int coupon = Integer.parseInt(couponStr);
                if (coupon == -1) {
                    break; // End of agent's coupon list
                } else if (coupon == 5) { 
                    couponsSold[0]++; // Increment count of RM5 coupons
                } else if (coupon == 10) {
                    couponsSold[1]++; // Increment count of RM10 coupons
                } else if (coupon == 20) {
                    couponsSold[2]++; // Increment count of RM20 coupons
                }
            }

            // Calculate the total coupon value
            totalValue += couponsSold[0] * 5; // RM5 coupons
            totalValue += couponsSold[1] * 10; // RM10 coupons
            totalValue += couponsSold[2] * 20; // RM20 coupons

            // Output the result
            System.out.printf("Agent #%d: %d %d %d %.2f%n", agentNum, couponsSold[0], couponsSold[1], couponsSold[2], totalValue);
        }
    }
}