import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args) {
        System.out.println("\n\nWEIGHT CONVERTER PROGRAM");
        System.out.println("choice 1: To convert lbs to kg");
        System.out.println("choice 2: To convert kg to lbs");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        double weight;
        double newweight;

        switch(choice){
            case 1:
            System.out.print("Enter your weight in lbs: ");
            weight = sc.nextDouble();
            newweight = weight*0.453592;
            System.out.println("Your weight in kg is: "+newweight);
            break;

            case 2:
            System.out.print("Enter your weight in kgs: ");
            weight = sc.nextDouble();
            newweight = weight*2.20462;
            System.out.println("Your weight in lbs is: "+newweight);
            break;

            default:
            System.out.println("Enter a valid choice(either 1 or 2)!");
        }
        sc.close();
    }
}
