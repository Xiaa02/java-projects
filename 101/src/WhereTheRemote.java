import java.util.Scanner;

public class WhereTheRemote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine(); // Consume the newline character
        
        for (int i = 0; i < n; i++) {
            String message = s.nextLine();
            String decryptedMessage = decryptMessage(message);
            System.out.println(decryptedMessage);
        }
        
        s.close();
    }
    
    public static String decryptMessage(String message) {
        StringBuilder decrypted = new StringBuilder();
        
        for (int i = message.length() - 1; i >= 0; i--) {
            char c = message.charAt(i);
            
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isUpperCase(c)) {
                c = Character.toUpperCase(c);
            }
            
            decrypted.append(c);
        }
        
        return decrypted.toString();
    }
}

