import java.util.Scanner;

public class ZooManagementSystem {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        // add a while loop
        while(choice != 3){
        // FEATURE 1
        System.out.println("Welcome to the Zoo Management System");
        System.out.println("menu");
        System.out.println("1. View Animals");
        System.out.println("2. Search Animals");
        System.out.println("3. Exit");
        choice = scanner.nextInt();
        // Scanner scanner input


        switch(choice){
            case 1: 
                System.out.println("Animals in the zoo: ");
                System.out.println("Lion");
                System.out.println("Elephant");
                System.out.println("Giraffe");
                break;

            case 2:
                System.out.println("Add animal selected:");
                scanner.nextLine();

                // Storing data in variables

                System.out.println("Enter animal name");
                String name = scanner.nextLine();

                System.out.println("Enter animal type: ");
                String type = scanner.nextLine();

                System.out.println("Enter animal age: ");
                int age = scanner.nextInt();
                    System.out.println("\nAnimal Added:");
                
                System.out.println("Name: " + name);
                System.out.println("Type: " + type);
                System.out.println("Age: " + age);

                break;
                
            
            case 3:
                System.out.println("Exiting program...");
                break;
            
            default:
                System.out.println("Invalid option");
        }

        }
        // PART 1 COMPLETED

        // PART 2


    }
    
}
