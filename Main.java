import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Instantiate an object for user input
        Scanner scanner = new Scanner(System.in);
        Set<String> names = new HashSet<>();

        System.out.println("How many people are apart of this event?");
        int numNames = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter their names each on a new line.");
        for(int i = 0; i < numNames; i++){
           String userInput = scanner.nextLine();
           names.add(userInput);
        }

        System.out.println("The list of names is:");
        System.out.println(names);
    }
}
