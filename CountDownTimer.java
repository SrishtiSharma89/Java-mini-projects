import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to start count with: ");
        int countStart = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter any message to display: ");
        String displayMessage = sc.nextLine();
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int count = countStart;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count==0){
                    timer.cancel();/*If we donot cancel the timer, the countdown will go to 
                                    negative numbers also and print message to be displayed on
                                    displaying of each negative numbers*/
                    System.out.println(displayMessage);
                }
            }
        };
        // timer.schedule(timerTask, 0);//If you do this only starting value of counting is printed
        timer.schedule(timerTask, 0, 1000);
        sc.close();
    }
}
