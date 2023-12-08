import java.util.Scanner;

public class CoconutMinMax {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); // Number of cases

        for (int i = 0; i < N; i++) {
            int x = s.nextInt(); // Length of time period
            int[] coconuts = new int[x];

            for (int j = 0; j < x; j++) {
                coconuts[j] = s.nextInt();
            }

            int[] occurrences = new int[101]; // Array to store occurrences of coconuts (0 to 100)
            int minCoconuts = Integer.MAX_VALUE;
            int maxCoconuts = Integer.MIN_VALUE;

            for (int coconut : coconuts) {
                occurrences[coconut]++;
                minCoconuts = Math.min(minCoconuts, coconut);
                maxCoconuts = Math.max(maxCoconuts, coconut);
            }

            int minOccurrences = occurrences[minCoconuts];
            int maxOccurrences = occurrences[maxCoconuts];

            System.out.println(minCoconuts + " " + minOccurrences + " " + maxCoconuts + " " + maxOccurrences);
        }
    }
}
