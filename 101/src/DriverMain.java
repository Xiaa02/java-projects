import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of customers

        for (int customerNumber = 1; customerNumber <= n; customerNumber++) {
            int m = scanner.nextInt(); // Number of coordinates for this customer
            List<String> coordinatesList = new ArrayList<>();

            // Read and store the coordinates for the current customer
            for (int i = 0; i < m; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                coordinatesList.add("[" + x + "," + y + "]");
            }

            // Print the result for the current customer
            System.out.print("Cust #" + customerNumber + ": ");
            for (int i = 0; i < coordinatesList.size(); i++) {
                System.out.print(coordinatesList.get(i));
                if (i < coordinatesList.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
