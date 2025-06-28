import java.util.Scanner;
public class BankingProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Java Banking Program");
        double balance=50000;
        System.out.println("1: To view current balance\n2: To deposit balance\n3: To withdraw balance\n4: To exit");
        while(true){
            System.out.print("Choose any option: ");
            int option = sc.nextInt();
            switch(option){
                case 1:
                System.out.println("Your current balance is: "+balance);
                break;
                case 2:
                System.out.print("Enter amount to deposit: ");
                double dAmount = sc.nextDouble();
                if(dAmount>=0){
                    balance = balance + dAmount;
                    System.out.println("Deposit successful!\nYour new balance after deposit is: "+balance);
                }
                else{
                    System.out.println("Balance cannot be negative!");
                }
                break;
                case 3:
                System.out.print("Enter amount to withdraw: ");
                double wAmount = sc.nextDouble();
                if(wAmount<0){
                    System.out.println("Balance cannot be negative!");
                }
                else if(wAmount<=balance){
                    balance = balance - wAmount;
                    System.out.println("Withdrawal successful!\nYour new balance after withdrawal is: "+ balance);
                }
                else{
                    System.out.println("Insufficient balance to withdraw!");
                }
                break;

                case 4:
                System.out.println("Exiting the program.\nThank you!");
                sc.close();
                return;

                default:
                System.out.println("Enter a valid choice!");
            }
        }
    }
}
