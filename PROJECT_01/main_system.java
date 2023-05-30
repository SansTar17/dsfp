package PROJECT_01;

import java.util.Scanner;

public class main_system{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        boolean conds = true;
        Choices choices = new Choices();

        while (conds) {
            System.out.println("\nENTER YOUR OPTION:");
            System.out.println("[1]: \tRegister training and add participant");
            System.out.println("[2]: \tSorting and display participant list");
            System.out.println("[3]: \tSearch participant");
            System.out.println("[4]: \tExit Program");
            
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    //code start here
                    choices.choice_1();
                    break;
                case 2:
                    //code start here
                    choices.choice_2();
                    break;
                case 3:
                    //code start here
                    choices.choice_3();
                    break;
                case 4:
                    // exit program
                    System.out.println("Exiting program...");
                    conds = false;
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
            
        }
        
        sc.close(); // close scanner object
    }
    
}
