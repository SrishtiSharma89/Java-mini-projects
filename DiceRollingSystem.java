package Lecture20to30;
import java.util.*;
public class DiceRollingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total=0;
        System.out.print("Enter the number of dice: ");
        numOfDice = sc.nextInt();
        if(numOfDice>0){
            for(int i=0; i<numOfDice; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("Your rolled "+roll);
                total = total + roll;
            }
            System.out.println("Total: "+total);
        }
        else{
            System.out.println("Number of dice must be greater than zero!");
        }

        sc.close();
    }
    //die = singular of dice
    public static void printDie(int roll){
        //yo dot window+r garera charmap search garera last tira bata select garera copy gareko
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}

