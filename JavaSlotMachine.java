package Lecture30to40;
import java.util.Random;
import java.util.Scanner;
//If you got matching emojis you are going to win
public class JavaSlotMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 1000.00;
        double betAmount=0;
        double payOut;
        String[] row;//it is going to contain symbols/emojis that's why we're creating a string array
        String playAgain;
        System.out.println("............................");
        System.out.println("Welcome to Java SLot Machine");
        System.out.println(" Symbols: 💗 🍕 ✨ 🎁 🎼 ");
        System.out.println("............................");
        while(balance>0){
            System.out.println("Current balance: "+balance);
            System.out.print("Enter your bet amount: ");
            betAmount = sc.nextDouble();
            if(betAmount<=0){
                System.out.println("Bet must be greater than zero");
                continue;
            }
            if(betAmount > balance){
                System.out.println("INSUFFICIENT FUNDS!");
                System.out.println("Your balance is "+balance);
                continue;
            }
            else{
                balance -= betAmount;
                System.out.println("Your new balance is "+ balance);
            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payOut = getPayout(row, betAmount);

            if(payOut > 0){
                System.out.println("You won Rs."+payOut);
                balance+=payOut;
            }
            else{
                System.out.println("Sorry you lost this round!");
            }
            sc.nextLine();
            System.out.print("DO YOU WANT TO PLAY AGAIN? (Y/N): ");
            playAgain = sc.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }
        
        System.out.println("*******************");
        System.out.println("GAME OVER! Your final balance is "+balance);
        System.out.println("THANKS FOR PLAYING!");
        System.out.println("*******************");
        sc.close();
    }
    static String[] spinRow(){
        String[] symbols = {"💗", "🍕", "✨", "🎁", "🎼" };
        String[] row = new String[3];
        Random random = new Random();

        for(int i=0;i<3;i++){
            row[i]= symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("***********************************");
        System.out.println(" "+ String.join(" | ", row));//for every string in our string array of row we're going to join them with a vertical bar with space before and after them
        System.out.println("***********************************");
    }
    static double getPayout(String[] row, double bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "💗" -> bet*3.0;
                case "🍕" -> bet*4.0;
                case "✨" -> bet*5.0;
                case "🎁" -> bet*10.0;
                case "🎼" -> bet*20.0;
                default -> 0.0;
            };
        }
        else if(row[0].equals(row[1]) || row[1].equals(row[2])){
            return switch(row[0]){
                case "💗" -> bet*2.0;
                case "🍕" -> bet*3.0;
                case "✨" -> bet*4.0;
                case "🎁" -> bet*5.0;
                case "🎼" -> bet*10.0;
                default -> 0.0;
            };
        }

        return 0.0;
    }
}