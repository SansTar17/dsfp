package PROJECT_01;

import java.util.Scanner;

public class Choices{

    // Declare the LinkedList field
    private LinkedList<Participant> participantList = new LinkedList<>();    
    //Declare the global scanner
    private Scanner scanner = new Scanner(System.in); 
    
    
    //Register training and add participant
    public void choice_1() {
    
        while (true) {
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();
    
            if (isParticipantRegistered(name)) {
                System.out.println("Participant already registered!");
                continue; // Continue to the next iteration of the loop
            }
    
            System.out.println("Your ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the integer
    
            if (isIdRegistered(id)) {
                System.out.println("ID already registered!");
                continue; // Continue to the next iteration of the loop
            }
    
            // Create a new Participant object
            Participant participant = new Participant(name, id);
    
            participantList.addLast(participant);
            
            int userInput = 0;

            while (true) {
                System.out.println(
                        "\nUser successfully registered, do you want to add another user?" +
                                "\n[1]\tContinue\n[2]\tExit"
                );
                userInput = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
    
                if (userInput == 1 || userInput == 2) {
                    break; // Exit the inner loop
                } else {
                    System.out.println("Invalid input. Please enter either 1 or 2.");
                }
            }
    
            if (userInput == 2) {
                break; // Exit the outer loop
            }
        }
    }
    

    public void choice_2(){

        MergeSort.mergeSort(participantList);
    
        // Display the sorted participant list
        for (int i = 0; i < participantList.size(); i++) {
            Participant participant = participantList.get(i);
            System.out.println("Name: "+participant.getName()+"\t"+"Id:"+participant.getId());
        }        
    }

    public void choice_3() {
        
       System.out.println("Enter participant name to search:");
       String searchName = scanner.nextLine();

       Participant searchResult = SearchingAlgorithms.searchParticipant(searchName, participantList);

       if (searchResult != null) {
           System.out.println("Participant found!");
           System.out.println("Name: " + searchResult.getName() + " "+"ID:" + searchResult.getId());
       } else {
           System.out.println("Participant not found.");
       }
       
    }

    public boolean choice_4() {
        // exit program
        System.out.println("Exiting program...");
        return false;
    }

    private boolean isParticipantRegistered(String name) {
        for (int i = 0; i < participantList.size(); i++) {
            Participant participant = participantList.get(i);
            if (participant.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isIdRegistered(int id) {
        for (int i = 0; i < participantList.size(); i++) {
            Participant participant = participantList.get(i);
            if (participant.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    
}    
