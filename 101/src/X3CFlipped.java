import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Your program will be evaluated by this DriverMain class and several test cases.

public class X3CFlipped {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numCase = s.nextInt(); // Read the number of test cases

        for (int caseNum = 1; caseNum <= numCase; caseNum++) {
            int[][] matrix = new int[6][6];

            // Read the 6x6 matrix for the current test case
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    matrix[i][j] = s.nextInt();
                }
            }

            // Find cells to be flipped and print the output
            List<String> flippedCells = findFlippedCells(matrix);
            printOutput(caseNum, flippedCells);
        }
    }

    public static List<String> findFlippedCells(int[][] matrix) {
        List<String> flippedCells = new ArrayList<>();

        // Iterate through the matrix to find cells to be flipped
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    int rowCount = countRowOnes(matrix, i);
                    int colCount = countColOnes(matrix, j);

                    // Check if both row and column have an odd number of 1s
                    if (rowCount % 2 != 0 && colCount % 2 != 0) {
                        flippedCells.add("[" + i + "," + j + "]");
                    }
                }
            }
        }

        // Sort the flipped cells based on column coordinates
        Collections.sort(flippedCells, (a, b) -> {
            int colA = Integer.parseInt(a.substring(a.indexOf(',') + 1, a.indexOf(']')));
            int colB = Integer.parseInt(b.substring(b.indexOf(',') + 1, b.indexOf(']')));
            return Integer.compare(colA, colB);
        });

        return flippedCells;
    }

    public static int countRowOnes(int[][] matrix, int row) {
        int count = 0;
        for (int j = 0; j < 6; j++) {
            count += matrix[row][j];
        }
        return count;
    }

    public static int countColOnes(int[][] matrix, int col) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            count += matrix[i][col];
        }
        return count;
    }

    public static void printOutput(int caseNum, List<String> flippedCells) {
        System.out.print("Case #" + caseNum + ": ");

        // Print the coordinates of flipped cells
        for (int i = 0; i < flippedCells.size(); i++) {
            System.out.print(flippedCells.get(i));
            if (i < flippedCells.size() - 1) {
                System.out.print(""); 
            }
        }
        System.out.println(); // Move to the next line
    }
}