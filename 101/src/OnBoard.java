import java.util.Scanner;

public class OnBoard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int caseNum = 1; caseNum <= n; caseNum++) {
            int rows = s.nextInt();
            int cols = s.nextInt();

            System.out.println("Board #" + caseNum + ": " + rows + "*" + cols);
            generateBoard(rows, cols);

        }
        s.close();
    }

    public static void generateBoard(int rows, int cols) {
        for (int i = 0; i < rows * 2 + 1; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("+-");
                }
                System.out.println("+");
            } else {
                for (int j = 0; j < cols; j++) {
                    System.out.print("| ");
                }
                System.out.println("|");
            }
        }
    }
}

