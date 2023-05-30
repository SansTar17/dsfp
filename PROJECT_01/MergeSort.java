package PROJECT_01;

public class MergeSort {

    public static void mergeSort(LinkedList<Participant> list) {
        
        // Base case: If the list has one element or is empty, it is already sorted
        if (list.size() <= 1) {
            return;
        }

        // Divide the list into two halves
        LinkedList<Participant> leftHalf = new LinkedList<>();
        LinkedList<Participant> rightHalf = new LinkedList<>();
        int middle = list.size() / 2;
        for (int i = 0; i < middle; i++) {
            leftHalf.addLast(list.get(i));
        }
        for (int i = middle; i < list.size(); i++) {
            rightHalf.addLast(list.get(i));
        }

        // Recursively sort the left and right halves
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge the sorted halves back together
        merge(leftHalf, rightHalf, list);
    }

    private static void merge(LinkedList<Participant> left, LinkedList<Participant> right, LinkedList<Participant> result) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        // Compare and merge elements from left and right halves into the result list
        while (leftIndex < left.size() && rightIndex < right.size()) {
            Participant leftParticipant = left.get(leftIndex);
            Participant rightParticipant = right.get(rightIndex);

            // Compare names and add the smaller one to the result list
            if (leftParticipant.getName().compareTo(rightParticipant.getName()) <= 0) {
                result.set(resultIndex++, leftParticipant);
                leftIndex++;
            } else {
                result.set(resultIndex++, rightParticipant);
                rightIndex++;
            }
        }

        // Add any remaining elements from the left half
        while (leftIndex < left.size()) {
            result.set(resultIndex++, left.get(leftIndex++));
        }

        // Add any remaining elements from the right half
        while (rightIndex < right.size()) {
            result.set(resultIndex++, right.get(rightIndex++));
        }
    }
    
}
