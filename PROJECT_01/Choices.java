package PROJECT_01;

import java.util.Scanner;

public class Choices{

    // Declare the LinkedList field
    private LinkedList<Participant> participantList = new LinkedList<>();    
    //Declare the global scanner
    private Scanner scanner = new Scanner(System.in); 
    
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
    
       
  
    //Register training and add participant
    public boolean choice_1(){

        
        
        System.out.println("Please enter your name (or 'stop' to finish):");

       while (true) {
        
        System.out.println("Your name:");
        String name = scanner.nextLine();

       
        if (isParticipantRegistered(name)) {
            System.out.println("Participant already registered!");
            continue; // Continue to the next iteration of the loop
        }//request to type again if name registered

                    
        if (name.equalsIgnoreCase("stop")) {
            break; // Exit the loop if the user enters 'stop'
        
        }
        
        System.out.println("Your id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        if (isIdRegistered(id)) {
            System.out.println("ID already registered!");
            continue;
        }//request to type again if id registered
             

        // Create a new Participant object
        Participant participant = new Participant(name,id);
        
        participantList.addLast(participant);

    }
    return false;
                
        
}


    

    //Sorting and display participant list
    public void choice_2(){

        MergeSort.mergeSort(participantList);
    
        // Display the sorted participant list
        for (int i = 0; i < participantList.size(); i++) {
            Participant participant = participantList.get(i);
            System.out.println("hi "+participant.getName()+" "+"id:"+participant.getId());
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
}    
