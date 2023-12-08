import java.util.Scanner;

public class TheHerbalSalesman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Read the number of cases
        int numCases = s.nextInt();
        
        for (int caseNum = 1; caseNum <= numCases; caseNum++) {
            // Read the length of the period (in days)
            int periodLength = s.nextInt();
            
            // Read the number of product sales for each day in the period
            int[] salesData = new int[periodLength];
            for (int i = 0; i < periodLength; i++) {
                salesData[i] = s.nextInt();
            }
            
            // Calculate the minimum and maximum sales and their frequencies
            int minSales = Integer.MAX_VALUE;
            int maxSales = Integer.MIN_VALUE;
            int minFrequency = 0;
            int maxFrequency = 0;
            
            for (int i = 0; i < periodLength; i++) {
                int currentSales = salesData[i];
                
                if (currentSales < minSales) {
                    minSales = currentSales;
                    minFrequency = 1;
                } else if (currentSales == minSales) {
                    minFrequency++;
                }
                
                if (currentSales > maxSales) {
                    maxSales = currentSales;
                    maxFrequency = 1;
                } else if (currentSales == maxSales) {
                    maxFrequency++;
                }
            }
            
            // Print the result in the specified format
            System.out.println("Case #" + caseNum + ": " + minSales + " " + minFrequency + " " + maxSales + " " + maxFrequency);
        }
        
        s.close();
    }
}
