import java.util.Scanner;

public class NTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt(); // Number of loops
        int size = s.nextInt(); // Size of the triangle
        
        for (int loop = 0; loop < N; loop++) {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            
        }
        
        s.close();
    }
}

