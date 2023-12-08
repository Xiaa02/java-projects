import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeWages {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int n = s.nextInt(); // Number of employees

        for (int x = 1; x <= n; x++) {
            double payRate = s.nextDouble();
            int hoursWorked = s.nextInt();

            double grossPay = payRate * hoursWorked;
            double withholdingTax = computeWithholdingTax(grossPay);
            double netPay = grossPay - withholdingTax;

            System.out.println("Employee #" + x + ": " +
                               df.format(grossPay) + " " +
                               df.format(withholdingTax) + " " +
                               df.format(netPay));
        }

        s.close();
    }

    public static double computeWithholdingTax(double grossPay) {
        double withholdingPercentage = 0.0;

        if (grossPay <= 3000.00) {
            withholdingPercentage = 0.10;
        } else if (grossPay > 3000.00 && grossPay <= 4000.00) {
            withholdingPercentage = 0.12;
        } else if (grossPay > 4000.00 && grossPay <= 5000.00) {
            withholdingPercentage = 0.15;
        } else if (grossPay > 5000.00) {
            withholdingPercentage = 0.20;
        }

        return grossPay * withholdingPercentage;
    }
}
