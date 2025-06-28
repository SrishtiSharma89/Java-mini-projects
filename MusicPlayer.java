package Lecture60to71;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
/*I have used .wav format music in this code.
 *You can easily convert .mp3 to .wav from internet */
public class MusicPlayer {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ACER\\Desktop\\Java Practice\\Lecture60to71\\bells-random-26103.wav";
        File file = new File(filePath);

        try(Scanner sc = new Scanner(System.in);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response="";
            while(!response.equals("Q")){
                System.out.println("P=Play");
                System.out.println("S=Stop");
                System.out.println("R=Reset");
                System.out.println("Q=Quit");

                System.out.print("Enter your choice: ");
                response = sc.next().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("\n***Enter a valid choice!***");
                }
            }
            
        }

        catch(FileNotFoundException e){
            System.out.println("Couldn't locate the file!");
        }
        catch(LineUnavailableException e){//Another resource is trying to access this file
            System.out.println("Unable to access audip resource!");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported!");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }

        finally{
            System.out.println("Music player is fun!");
            
        }
    }
}
