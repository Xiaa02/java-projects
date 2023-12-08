import java.util.Scanner;

public class LetterOccurrences {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            String input = s.nextLine();
            if (input.equals("#")) {
                break;
            }

            int[] letterCounts = new int[26]; // Array to store letter counts
            input = input.toLowerCase(); // Convert to lowercase for case-insensitive comparison

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    letterCounts[c - 'a']++;
                }
            }

            System.out.print("Case #" + caseNumber + ": ");
            for (int i = 0; i < 26; i++) {
                if (letterCounts[i] > 0) {
                    char letter = (char) ('a' + i);
                    System.out.print(letter + "(" + letterCounts[i] + ") ");
                }
            }
            System.out.println();
            
            caseNumber++;
        }

        s.close();
    }
}
