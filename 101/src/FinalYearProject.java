import java.util.Scanner;

public class FinalYearProject {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNum = 1;

        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                break;
            }

            int[][] students = new int[n][6];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 6; j++) {
                    students[i][j] = s.nextInt();
                }
            }

            System.out.println("Case #" + caseNum + ":");
            for (int i = 0; i < n; i++) {
                int[] docs = students[i];
                StringBuilder missingDocs = new StringBuilder();

                for (int j = 0; j < 6; j++) {
                    if (docs[j] == 0) {
                        if (missingDocs.length() > 0) {
                            missingDocs.append(", ");
                        }
                        missingDocs.append(j + 1);
                    }
                }

                if (missingDocs.length() == 0) {
                    System.out.println("Student" + (i + 1) + " : complete");
                } else {
                    System.out.println("Student" + (i + 1) + " : not complete");
                }
            }

            caseNum++;
        }

        s.close();
    }
}
