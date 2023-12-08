import java.util.Scanner;


public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNum = 1; //test case
        
        while(true) {
            double myr = s.nextDouble();
            if (myr ==-1) {
                break;
            }
            double usd = myr * 0.2151;
            double gbp = myr * 0.1689;
            
            System.out.printf("Case #%d: %.2f %.2f %.2f%n", caseNum, myr, usd, gbp);
            caseNum++;
        }
        s.close();
    }
}
