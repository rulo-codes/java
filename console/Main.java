import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create new scanner
        Scanner scanner = new Scanner(System.in);

        // Input Name
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        // Input Age
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        // This cleans the scanner, preventing skipping other scanner
        scanner.nextLine();
        // Input fav food
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        //Display stored values of user input
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old...");
        System.out.println("And you like " + food + "!");
    }
}