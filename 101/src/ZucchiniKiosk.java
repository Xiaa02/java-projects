import java.text.DecimalFormat;
import java.util.Scanner;

public class ZucchiniKiosk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int N = s.nextInt(); // Number of test cases
        
        for (int i = 1; i <= N; i++) {
            int option = s.nextInt(); // Option number
            int quantity = s.nextInt(); // Quantity
            
            double total = calculateTotal(option, quantity);
            System.out.println("Case #" + i + ": RM" + df.format(total));
        }
        
        s.close();
    }
    
    public static double calculateTotal(int option, int quantity) {
        double total = 0.0;
        
        switch (option) {
            case 1:
                total = 7.50 * quantity;
                break;
            case 2:
                total = 6.99 * quantity;
                break;
            case 3:
                total = 4.70 * quantity;
                break;
            case 4:
                total = 5.30 * quantity;
                break;
            case 5:
                total = 5.99 * quantity;
                break;
            default:
                break;
        }
        
        return total;
    }
}
