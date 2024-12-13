import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        // Create a LinkedList of Integer type
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        // Display the LinkedList
        System.out.println("Initial LinkedList: " + linkedList);

        // Add an element at a specific index
        linkedList.add(2, 25);
        System.out.println("After adding 25 at index 2: " + linkedList);

        // Access elements
        Integer firstElement = linkedList.getFirst();
        Integer lastElement = linkedList.getLast();
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Remove an element by index
        Integer removedElement = linkedList.remove(1); // Removes element at index 1
        System.out.println("Removed Element at index 1: " + removedElement);
        System.out.println("After removal by index: " + linkedList);

        // Remove a specific element
        boolean isRemoved = linkedList.remove(Integer.valueOf(30)); // Removes the first occurrence of 30
        System.out.println("Was 30 removed? " + isRemoved);
        System.out.println("After removing 30: " + linkedList);

        // Check if an element exists
        boolean contains40 = linkedList.contains(40);
        System.out.println("Does the list contain 40? " + contains40);

        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        // Iterate through the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for (Integer item : linkedList) {
            System.out.println(item);
        }

        // Clear all elements
        linkedList.clear();
        System.out.println("LinkedList after clearing all elements: " + linkedList);
    }
}
