import java.util.Scanner;

public class CampusElection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numFaculties = s.nextInt();

        for (int i = 1; i <= numFaculties; i++) {
            int numCandidates = s.nextInt();
            int[] votes = new int[numCandidates];
            int[] candidateIndexes = new int[numCandidates];  //  to keep track of the original indexes of the candidatesv

            for (int j = 0; j < numCandidates; j++) {
                votes[j] = s.nextInt();
                candidateIndexes[j] = j + 1;
            }

            for (int j = 0; j < numCandidates - 1; j++) {
                for (int k = j + 1; k < numCandidates; k++) {
                    if (votes[k] > votes[j]) {
                        int temp = votes[j];
                        votes[j] = votes[k];
                        votes[k] = temp;

                        temp = candidateIndexes[j];
                        candidateIndexes[j] = candidateIndexes[k];
                        candidateIndexes[k] = temp;
                    }
                }
            }

            System.out.println("Case #" + i + ": " + votes[0] + " " + candidateIndexes[0] + " " +
                               votes[1] + " " + candidateIndexes[1]);
        }

        s.close();
    }
}
