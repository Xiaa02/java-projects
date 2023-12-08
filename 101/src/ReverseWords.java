import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numTestCases = s.nextInt();
        s.nextLine(); // Consume the newline after the integer
        
        for (int caseNumber = 1; caseNumber <= numTestCases; caseNumber++) {
            String line = s.nextLine();
            String reversedLine = reverseWords(line);
            System.out.println("Case #" + caseNumber + ": " + reversedLine);
        }
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
    
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
    
        return reversedSentence.toString().trim().replaceAll("#$", "");
    }
}

