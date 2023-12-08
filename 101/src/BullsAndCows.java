import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                break;
            }

            int[] secretcode = new int[4];
            int[][] playercode = new int[n - 1][4];

            for (int i = 0; i < 4; i++) {
                secretcode[i] = s.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < 4; j++) {
                    playercode[i][j] = s.nextInt();
                }
            }

            for (int i = 0; i < n - 1; i++) {
                int bulls = 0, cows = 0;
                int[] temp = new int[10];

                for (int j = 0; j < 4; j++) {
                    if (secretcode[j] == playercode[i][j]) {
                        bulls++;
                    } else {
                        temp[playercode[i][j]]++;
                    }
                }

                for (int k = 0; k < 4; k++) {
                    if (temp[secretcode[k]] > 0) {
                        cows++;
                    }
                }

                System.out.println("Player #" + (i + 1) + ": " + bulls + " bulls " + cows + " cows");
            }
        }
    }
}