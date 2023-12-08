import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numTestCases = s.nextInt();
        s.nextLine(); // Consume the newline after the integer
        
        for (int caseNumber = 1; caseNumber <= numTestCases; caseNumber++) {
            String line = s.nextLine();
            int wordCount = countWords(line);
            System.out.println("Case #" + caseNumber + ": " + wordCount + " ");
        }
    }

    public static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (!word.equals("#")) {
                count++;
            }
        }
        return count;
    }
}
