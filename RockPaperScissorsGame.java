package Lecture30to40;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println(".............................");
        System.out.println("JAVA ROCK PAPER SCISSORS GAME");
        System.out.println(".............................");

        String[] options = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        do{
            System.out.print("Enter your move(rock paper scissors): ");
            playerChoice = sc.nextLine().toLowerCase();
            if(!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                !playerChoice.equals("scissors")){

                System.out.println("Enter a valid choice!");
                continue;

            }
            computerChoice = options[random.nextInt(3)];
            System.out.println("Computer's choice: "+computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
            System.out.print("Play again?(yes/no)?: ");
            playAgain = sc.nextLine().toLowerCase();

            if(!playAgain.equals("yes") && !playAgain.equals("no")){
                System.out.println("Enter either yes or no");
                continue;
            }

            }while(!playAgain.equals("no"));

            System.out.println("\n........THANKS FOR PLAYINGGGGG........!!!!\n");
        

            sc.close();
    }
}
