import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial LinkedList: " + fruits);

        // Add an element at the first position
        fruits.addFirst("Mango");

        // Add an element at the last position
        fruits.addLast("Orange");
        System.out.println("After adding Mango and Orange: " + fruits);

        // Remove elements
        fruits.remove("Banana"); // Remove by value
        fruits.removeFirst();    // Remove the first element
        fruits.removeLast();     // Remove the last element
        System.out.println("After removals: " + fruits);

        // Get elements
        String firstFruit = fruits.getFirst(); // Get the first element
        String lastFruit = fruits.getLast();   // Get the last element
        System.out.println("First fruit: " + firstFruit);
        System.out.println("Last fruit: " + lastFruit);

        // Iterate over the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear the LinkedList
        fruits.clear();
        System.out.println("LinkedList after clearing: " + fruits);
    }
}
