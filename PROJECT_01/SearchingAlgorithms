package PROJECT_01;

import PROJECT_01.LinkedList.Node;

public class SearchingAlgorithms {
    
    public static Participant searchParticipant(String targetParticipant, LinkedList<Participant> participantList) {
        
        if (participantList.isEmpty()) {
            System.out.println("Participant list is empty.");
            return null;

        } else {
            Node<Participant> current = participantList.head;

            while (current != null) {
                if (current.data.getName().equals(targetParticipant)) {
                    System.out.println("Participant found: " + targetParticipant);
                    return current.data;
                }
                current = current.next;
            }
            System.out.println("Participant not found: " + targetParticipant);
            return null;
        }
    }
}
