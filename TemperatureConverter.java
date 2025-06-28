package Lecture10to20;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n***TEMPERATURE CONVERTER***");
        double temp;
        double newTemp;
        String unit;

        

        System.out.print("You want to convert to Celsius or Fahrenheit?(C/F): ");
        unit = sc.next().toUpperCase();

        if(unit.equals("C")){
            System.out.print("Enter the temperature in Fahrenheit: ");
            temp = sc.nextDouble();
            newTemp = (temp-32)*(5.0/9.0);
            System.out.println("Your temperature in Celsius is "+newTemp+"°C.");
        }

        else if(unit.equals("F")){
            System.out.print("Enter the temperature in Celsius: ");
            temp = sc.nextDouble();
            newTemp = (temp*(9.0/5.0))+32;
            System.out.println("Your temperature in Fahrenheit is "+newTemp +"F");
        }

        else{
            System.out.println("Enter a valid choice(either c or f)");
        }
        sc.close();
    }
}
