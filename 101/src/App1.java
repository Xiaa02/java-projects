import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class App1 {
    static String start;

    public static void main (String [] args) {
        new App1();
    }
    public App1 () {
        
        try {
            File filename  = new File("F:\\OneDrive - Universiti Kebangsaan Malaysia\\JAVA PROJECTS\\101\\src\\Enchanted.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(filename);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            Scanner scan = new Scanner(System.in);
            System.out.print("Press any key to play the audio: ");
            start = scan.next();

            // Start a new thread to play the audio in the background
            Thread audioThread = new Thread(() -> {
                try {
                    System.out.println("The audio is playing!");
                    clip.start();
                    Thread.sleep(45000); // Allow the audio to play for 45 seconds
                    clip.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            audioThread.start(); // Start the audio thread

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}