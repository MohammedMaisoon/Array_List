import java.util.ArrayList;
import java.util.Scanner;
public class Array_List {
    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        ArrayList<String> fruits = new ArrayList<>();
        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Print the initial ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Remove an element from the ArrayList
        fruits.remove("Banana");

        // Print the ArrayList after removal
        System.out.println("Fruits after removal: " + fruits);

        // Iterate through the ArrayList using a for-each loop
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Adding more elements to the ArrayList using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fruit to add: ");
        String newFruit = scanner.nextLine();
        fruits.add(newFruit);
        // Print the updated ArrayList
        System.out.println("Updated list: " + fruits);
        // Check if an element exists in the ArrayList
        System.out.print("Enter a fruit to check if it exists: ");
        String checkFruit = scanner.nextLine();
        if (fruits.contains(checkFruit)) {
            System.out.println(checkFruit + " is in the list.");
        } else {
            System.out.println(checkFruit + " is not in the list.");
        }
        scanner.close();
    }
}
