import java.util.Scanner;

public class TriangleWaves {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); // Number of frequencies
        int amplitude = s.nextInt(); // Amplitude

        for (int freq = 1; freq <= N; freq++) {  // Loop through each frequency
            for (int i = 1; i <= amplitude; i++) {  // Generate the ascending part of the triangular wave
                for (int j = 1; j <= i; j++) {  // Print 'i' 'i' times to create the ascending part of the wave
                    System.out.print(i);
                }
                System.out.println();  // Move to the next line to create the next row of the wave
            }
            for (int i = amplitude - 1; i >= 1; i--) {  // Generate the descending part of the triangular wave
                for (int j = 1; j <= i; j++) {  // Print 'i' 'i' times to create the descending part of the wave
                    System.out.print(i);
                }
                System.out.println();   // Move to the next line to create the next row of the wave
            }
            // if (freq < N) {
            //      System.out.println(); // Add a blank line between waveforms
            //  }
        }

        s.close();
    }
}
