import java.util.Scanner;

public class X4DSeating {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] seatMap = new int[13][6]; // Initialize the airplane seating

        // Read the current seat occupancy status for each seat in the airplane
        for (int row = 0; row < 13; row++) {
            for (int col = 0; col < 6; col++) {
                seatMap[row][col] = s.nextInt();
            }
        }

        int numClients = s.nextInt(); // Read the number of clients
        s.nextLine(); // Consume the newline character

        for (int client = 1; client <= numClients; client++) {
            String[] clientInfo = s.nextLine().split(" ");
            char ticketType = clientInfo[0].charAt(0);
            char desiredSeat = clientInfo[1].charAt(0);

            int startRow, endRow;

            // Determine the range of rows based on the ticket type
            if (ticketType == 'F') {
                startRow = 0;
                endRow = 1; // First class
            } else if (ticketType == 'B') {
                startRow = 2;
                endRow = 6; // Business class
            } else {
                startRow = 7;
                endRow = 12; // Economy class
            }

            int seatColumn = desiredSeat - 'A'; // Calculate the column index of the desired seat

            // Find and print available seats for the client
            System.out.print("Cust #" + client + ": ");
            boolean foundSeat = false;
            for (int row = startRow; row <= endRow; row++) {
                if (seatMap[row][seatColumn] == 0) {
                    System.out.print("[" + row + "," + seatColumn + "]");
                    foundSeat = true;
                    seatMap[row][seatColumn] = 1; // Mark the seat as occupied
                }
            }

            if (!foundSeat) {
                System.out.print("No available seats");
            }

            System.out.println();
        }

        s.close();
    }
}