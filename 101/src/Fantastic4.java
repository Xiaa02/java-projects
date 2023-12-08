import java.util.Scanner;

public class Fantastic4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N;
        int count = 0;
        
        System.out.println("Enter positive integers (end with -1):");
        
        while (true) {
            N = s.nextInt();
            
            if (N == -1) {
                break;
            }
            
            if (N % 4 == 0) {
                count++;
            }
        }
        
        System.out.println("Count of integers divisible by 4: " + count);
        
        s.close();
    }
}
