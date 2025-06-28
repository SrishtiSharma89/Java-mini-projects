package Lecture10to20;
import java.util.Scanner;
public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the operatot(+,-,*,/,%,^): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        

        switch (op) {
            case '+' -> System.out.println("Addition: "+(num1+num2));
            case '-' -> System.out.println("Subtraction: "+(num1-num2));
            case '*' -> System.out.println("Multiplication: "+(num1*num2));
            case '/' -> {
                    if(num2==0){
                        System.out.println("Cannot divide by zero!");
                    }
                    else{
                        System.out.println("Division: "+(num1/num2));
                    }
                }
            case '%' -> System.out.println("Remainder: "+(num1%num2));
            case '^' -> System.out.println("Power: "+Math.pow(num1,num2));
        
            default -> System.out.println("Enter a valid operator!");
        }
        sc.close();
    }
    
}
