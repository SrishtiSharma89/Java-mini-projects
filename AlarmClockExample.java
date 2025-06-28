package Lecture60to71;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class AlarmClockExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime=null;
        String filePath = "C:\\Users\\ACER\\Desktop\\Java Practice\\Lecture60to71\\bells-random-26103.wav";

        while(alarmTime==null){
            try{
                System.out.print("Enter an alarm time(HH:MM:SS): ");
                String inputTime = sc.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for "+alarmTime);

            }catch(DateTimeParseException e){
                System.out.println("Invalid format! Please use (HH:MM:SS)");
            }
        }
        
        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, sc);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
        
    }
}
