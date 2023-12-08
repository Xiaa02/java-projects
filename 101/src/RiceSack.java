import java.util.Scanner;

public class RiceSack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); // Number of cases

        for (int caseNumber = 1; caseNumber <= N; caseNumber++) {
            int[] sackWeights = new int[10];

            for (int i = 0; i < 10; i++) {
                sackWeights[i] = s.nextInt();
            }

            int maxWeightIndex = findMaxWeightIndex(sackWeights);

            System.out.println("Case #" + caseNumber + ": " + sackWeights[maxWeightIndex]);
        }

        s.close();
    }

    public static int findMaxWeightIndex(int[] weights) {
        int maxIndex = 0;
        int maxWeight = weights[0];

        for (int i = 1; i < weights.length; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}

