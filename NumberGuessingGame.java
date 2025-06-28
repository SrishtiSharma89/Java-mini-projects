import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1,10);
        System.out.print("Guess any number: ");
        int guess = sc.nextInt();
        while(guess!=num){
            System.out.println("Try again!");
            if(guess<num){
                System.out.println("Your guess is lower than number!");
            }
            else{
                System.out.println("Your guess is greater than number!");
            }
            System.out.print("Enter your guess again: ");
            guess = sc.nextInt();
        }
        System.out.println("Yeah you won! The number was actually "+num);

        sc.close();
    }
    }

