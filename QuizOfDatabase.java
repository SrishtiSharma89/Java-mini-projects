import java.util.InputMismatchException;
import java.util.Scanner;

public class QuizOfDatabase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] questions = {"Physical level of data abstraction is also called?", 
                          "Which of the following command is of DDL(Data Definition Language)?", 
                          "Specialization is", 
                          "Which of the following operation is used to display information of selected attributes?", 
                          "Which is not the type of view?"};

        String[][] options = {{"1. Internal level", "2. Conceptual level", "3. external level", "4. none"}, 
                          {"1. SELECT", "2. GRANT", "3. TRUNCATE", "4. All of the above"}, 
                          {"1. Top-down approach", "2. Botton-up approach", "3. horizontal approach", "4. none"}, 
                          {"1. Selection", "2. Projection", "3. Cartesian Product", "4. Union"}, 
                          {"1. Simple view", "2. Complex view", "3. Materialized view", "4. Abstract view"}};

        int[] correctAnswers = {1, 3, 1, 2, 4};
        int score = 0;
        int response;
        
        try {
            for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            response = sc.nextInt();
            if(response<=0||response>4){
                System.out.println("\nEnter valid option(1-4)");
                break;
            }
            else if(response == correctAnswers[i]){
                System.out.println("\nCORRECT\n");
                score++;
            }
            else{
                System.out.println("\nWRONG");
                System.out.println("Correct option is "+correctAnswers[i]+"\n");
            }
            }
        if(score==questions.length){
            System.out.println("CONGRATULATIONS! You got all correct answers!");
        }
        System.out.println("Your final score is "+score+" out of "+questions.length+".");
        sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT FORMAT!");
        }
    }   
}
