import java.util.ArrayList;
import java.util.Scanner;

public class ZeroToHero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Read the number of test cases
        int numCases = s.nextInt();
        
        for (int caseNum = 1; caseNum <= numCases; caseNum++) {
            // Read the number of inputs
            int numInputs = s.nextInt();
            
            // Read the list of data
            ArrayList<Integer> dataList = new ArrayList<>();
            for (int i = 0; i < numInputs; i++) {
                dataList.add(s.nextInt());
            }
            
            // Find the largest odd value
            int largestOdd = 0;
            for (int value : dataList) {
                if (value % 2 == 1 && value > largestOdd) {
                    largestOdd = value;
                }
            }
            
            // Replace zeros with the largest odd value
            for (int i = 0; i < numInputs; i++) {
                if (dataList.get(i) == 0) {
                    dataList.set(i, largestOdd);
                }
            }
            
            // Print the result in the specified format
            System.out.print("Case #" + caseNum + ": [");
            for (int i = 0; i < numInputs; i++) {
                System.out.print(dataList.get(i));
                if (i < numInputs - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ]");
        }
        
        s.close();
    }
}
