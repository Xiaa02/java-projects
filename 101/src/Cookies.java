import java.util.Scanner;


public class Cookies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); // Number of test cases

        for (int caseNumber = 1; caseNumber <= N; caseNumber++) {
            int X = s.nextInt(); // Number of cookies
            int Y = s.nextInt(); // Number of cookies in a box
            int Z = s.nextInt(); // Number of boxes in a container

            int boxes = X / Y;
            int containers = boxes / Z;
            int remainingBoxes = boxes % Z;
            int remainingCookies = X % Y;

            System.out.println("Case #" + caseNumber + ": " + containers + " " + remainingBoxes + " " + remainingCookies);
        }

        s.close();
    }
}