import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt(); // Number of members in the group
        
        for (int caseNumber = 1; caseNumber <= N; caseNumber++) {
            double weight = s.nextDouble();
            double height = s.nextDouble();
            
            double bmi = weight / (height * height);
            String interpretation = interpretBMI(bmi);
            
            System.out.printf("Case #%d: %.2f %s%n", caseNumber, bmi, interpretation);
        }
    }
    
    public static String interpretBMI(double bmi) {
        if (bmi < 16) {
            return "serious underweight";
        } else if (bmi < 18) {
            return "underweight";
        } else if (bmi < 24) {
            return "normal weight";
        } else if (bmi < 29) {
            return "overweight";
        } else if (bmi < 35) {
            return "seriously overweight";
        } else {
            return "gravely overweight";
        }
    }
}
