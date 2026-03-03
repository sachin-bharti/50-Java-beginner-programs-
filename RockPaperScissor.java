import  java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("======= RPS Game Menu ======= ");
        System.out.println("Enter 0 for Rock \nEnter 1 for Paper \nEnter 2 for Scissor");
        int userinput = sc.nextInt();
        if (userinput < 0 || userinput > 3) {
            System.out.println("Inviled Input ...");
            return;
        }
        int computer_input=rand.nextInt(3);
        if(computer_input==userinput) {
            System.out.println("Game Draw !");
        }
        else if(userinput==0 && computer_input == 2 || userinput==1 && computer_input==0 || userinput==2 && computer_input==1){
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer Win !");

        }
        if (computer_input==0){
            System.out.println("Computer Choice : Rock");
        }
        else if (computer_input == 1) {
            System.out.println("Computer Choice : Paper");
        }
        if (computer_input == 2){
            System.out.println("Computer Choice : Scissor");
        }

    }

}