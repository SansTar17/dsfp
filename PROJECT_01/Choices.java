package PROJECT_01;

import java.util.Scanner;

public class Choices {

    // Declare the LinkedList field
    private LinkedList<Participant> participantList = new LinkedList<>();    
    //Declare the global scanner
    private Scanner sc = new Scanner(System.in);        
  
    //Register training and add participant
    public void choice_1(){
        
        System.out.println("Please enter your name:");

        String name = sc.nextLine();

        // Create a new Participant object
        Participant participant = new Participant(name);
        
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
        System.out.println("Soory this section is not yet updated!");
    }    
}
