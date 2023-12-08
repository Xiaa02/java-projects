import java.util.Scanner;

//Your program will be evaluated by this DriverMain class and several test cases.

public class X3BTicTacToe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // Number of games

        for (int gameNumber = 1; gameNumber <= n; gameNumber++) {
            char[][] board = new char[3][3];

            // Read the game board
            for (int i = 0; i < 3; i++) {
                String row = s.next();
                for (int j = 0; j < 3; j++) {
                    board[i][j] = row.charAt(j);
                }
            }

            char winner = determineWinner(board);

            // Print the result
            System.out.print("Game #" + gameNumber + ": ");
            if (winner != '-') {
                System.out.println(winner);
            } else {
                System.out.println("draw");
            }
        }
    }

    public static char determineWinner(char[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }

        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
            return board[0][2];
        }

        return '-';
    }
}



