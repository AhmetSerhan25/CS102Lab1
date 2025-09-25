import java.util.Scanner; 
import java.util.Arrays;

public class Main {
    private static int[] numbers;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array size: "); 
        int size = scanner.nextInt();
        numbers = ArrayOperations.generateRandomArray(size);

        int choice = 0;
        while(choice != 6){
            printMenu();  //(b) Display the menu options
            choice = scanner.nextInt();

            if(choice == 1) {
                // Display the array
                System.out.println("Array: " + Arrays.toString(numbers));

            } else if(choice == 2) {
                // Min & max
                System.out.println("Min: " + ArrayOperations.findMin(numbers));
                System.out.println("Max: " + ArrayOperations.findMax(numbers));

            } else if(choice == 3) {
                // Average & differences 

            } else if(choice == 4) {
                // Sum of even indexes

            } else if(choice == 5) {
                // Summ of odd indexes

            } else if(choice == 6) {
                System.out.println("Exiting...");
                
            } else {
                System.out.println("Invalid choice, try again!");
            }   
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Display array");
        System.out.println("2. Find min & max");
        System.out.println("3. Find average & differences");
        System.out.println("4. Sum of even indexes");
        System.out.println("5. Sum of odd indexes");
        System.out.println("6. Exit");
        System.out.println("Choice: ");
    }
}
