import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangManGame {
    public static void main(String[] args) {

        String filePath = "Lecture60to71\\HangmanWords.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=reader.readLine())!=null){
                words.add(line.trim());//to trim the whitespace
            }
        }
        
        catch(FileNotFoundException e){
            System.out.println("Couldn't locate the file!");
        }catch(IOException e){
            System.out.println("Unexpected error occurred!");
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;
        for(int i=0; i<word.length(); i++){
            wordState.add('_');
        }
        System.out.println("*******************************");
        System.out.println("Welcome to java HangMan Game..!");
        System.out.println("*******************************");

        while(wrongGuesses < 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");
            for(char c : wordState){
                System.out.print(c+" ");
            }
            System.out.println();
            System.out.print("Guess a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);
        
            if(word.indexOf(guess) >=0){
                System.out.println("Correct guess!");
                for(int i=0;i<word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("You won!");
                    System.out.println("The word was: "+word);
                    break;
                }
            }else{
                wrongGuesses++;
                System.out.println("Wrong guess!");
            }
        }
        if(wrongGuesses>=6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: "+ word);
        }

        sc.close();
    }
    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
                    


                    """;
            case 1 -> """
                       O

            
                    """;
            case 2 -> """
                       O 
                       |
            
                    """;
            case 3 -> """
                       O 
                      /|
            
                    """;
            case 4 -> """
                       O 
                      /|\\   
            
                    """;//duita kina gareko vane euta matra garda next line bujhinxa
            case 5 -> """
                       O 
                      /|\\
                      / 
                    """;
            case 6 -> """
                       O 
                      /|\\
                      / \\
                    """;
            default -> "";
        };
    }
}
