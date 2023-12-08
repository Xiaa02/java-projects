import java.util.Scanner;

public class InnerProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Read the number of test cases
        int numTestCases = s.nextInt();
        
        for (int caseNum = 1; caseNum <= numTestCases; caseNum++) {
            // Read the set size
            int setSize = s.nextInt();
            
            // Read the elements of set A
            int[] setA = new int[setSize];
            for (int i = 0; i < setSize; i++) {
                setA[i] = s.nextInt();
            }
            
            // Read the elements of set B
            int[] setB = new int[setSize];
            for (int i = 0; i < setSize; i++) {
                setB[i] = s.nextInt();
            }
            
            // Calculate the inner product
            int innerProduct = 0;
            for (int i = 0; i < setSize; i++) {
                innerProduct += setA[i] * setB[i];
            }
            
            // Print the result in the specified format
            System.out.println("Case #" + caseNum + ": " + innerProduct);
        }
        
        s.close();
    }
}
