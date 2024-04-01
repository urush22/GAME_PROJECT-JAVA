import java.util.*;

public class rockpaperscissorgame {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor
        //taking user's choice in the game
        Scanner sc = new Scanner(System.in);
        System.out.print("Instructions-->\n '0' for Rock,\n '1' for Paper,\n '2' for Scissor.\n ");
        System.out.print("enter the number out of (0,1,2):");
        int userchoice = sc.nextInt();
        //allows computer to make choice randomly
        Random rand = new Random();
        int computerchoice = rand.nextInt(3);

        if (userchoice == computerchoice) {
            System.out.println("This is a 'Draw' computer and user choice is same");
        }
        else if (userchoice == 0 && computerchoice == 1 ) {
            System.out.println("OOPS!");
            System.out.println("computer Win!");
        } 
        else if (userchoice==1 && computerchoice==2) {
            System.out.println("OOPS!");
            System.out.println("computer Win!");
        }
        else if (userchoice==2 && computerchoice==0) {  
        System.out.println("OOPS!");
        System.out.println("computer Win!");
        }
        else {
            System.out.println("HOORAY!");
            System.out.println("You Win!");
        }
        //giving output to the user about computer's choice
        if(computerchoice==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerchoice==1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerchoice==2){
            System.out.println("Computer choice: Scissors");
        }
        sc.close();
    }
}
