import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Instantiate an object for user input
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter the number of people:");
        int numNames = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the list of people:");
        for(int i = 0; i < numNames; i++){
           String userInput = scanner.nextLine();
           names.add(userInput);
        }

        System.out.println("The list of names is:");
        System.out.println(names);
    }
}
