import java.util.Scanner;

public class DieRollSimulation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Number of test cases

        for (int i = 1; i <= n; i++) {
            int[] frequencies = new int[7]; // Index 0 is not used, frequencies for faces 1 to 6

            while (true) {
                int roll = s.nextInt();
                if (roll == -1) {
                    break;
                }
                frequencies[roll]++;
            }

            System.out.println("Case #" + i + ":");
            for (int j = 1; j <= 6; j++) {
                System.out.println("Face " + j + ":" + frequencies[j]);
            }
        }
    }
}
