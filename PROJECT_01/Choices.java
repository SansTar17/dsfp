package PROJECT_01;

import java.util.Scanner;

public class Choices {

    // Declare the LinkedList field
    private LinkedList<Participant> participantList = new LinkedList<>();    
    //Declare the global scanner
    private Scanner scanner = new Scanner(System.in);        
  
    //Register training and add participant
    public void choice_1(){
        
        System.out.println("Please enter your name:");

        String name = scanner.nextLine();

        //add code to assign id
        Integer Id = 01; //ChangeLater
        

        // Create a new Participant object
        Participant participant = new Participant(name,Id);
        
        participantList.addLast(participant);
        
    }

    //Sorting and display participant list
    public void choice_2(){

        MergeSort.mergeSort(participantList);
    
        // Display the sorted participant list
        for (int i = 0; i < participantList.size(); i++) {
            Participant participant = participantList.get(i);
            System.out.println("hi "+participant.getName());
        }        
    }

    public void choice_3() {
        
       System.out.println("Enter participant name to search:");
       String searchName = scanner.nextLine();

       Participant searchResult = SearchingAlgorithms.searchParticipant(searchName, participantList);

       if (searchResult != null) {
           System.out.println("Participant found!");
           System.out.println("Name: " + searchResult.getName() + ", ID: " + searchResult.getId());
       } else {
           System.out.println("Participant not found.");
       }
       
    }
}    
