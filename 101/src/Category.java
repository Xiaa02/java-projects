import java.util.Scanner;

public class Category {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();  // Number of test cases

        for (int caseNumber = 1; caseNumber <= N; caseNumber++) {
            int X = s.nextInt();  // Number of data
            int[] data = new int[X];

            for (int i = 0; i < X; i++) {
                data[i] = s.nextInt();  // Read data
            }

            System.out.println("Case #" + caseNumber + ": " + X);

            int[] frequency = new int[5];
            for (int value : data) {
                if (value >= 1 && value <= 20) {
                    frequency[0]++;
                } else if (value >= 21 && value <= 40) {
                    frequency[1]++;
                } else if (value >= 41 && value <= 60) {
                    frequency[2]++;
                } else if (value >= 61 && value <= 80) {
                    frequency[3]++;
                } else if (value >= 81 && value <= 100) {
                    frequency[4]++;
                }
            }

            String[] categories = {
                " 1..20 ",
                "21..40 ",
                "41..60 ",
                "61..80 ",
                "81..100"
            };

            for (int i = 0; i < 5; i++) {
                System.out.println(categories[i] + " : " + frequency[i]);
            }
        }

        s.close();
    }
}
