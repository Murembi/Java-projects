import java.util.Scanner;

public class ZooManagementSystem {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // FEATURE 1
        System.out.println("Welcome to the Zoo Management System");
        System.out.println("menu");
        System.out.println("1. View Animals");
        System.out.println("2. Search Animals");
        System.out.println("4. Exit");
        int choice = scanner.nextInt();
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



        // ADD ANIMAL
        //ENTER ANIMAL NAME
        System.out.println("Enter animal name: ");
        String animalName = scanner.nextLine();
        
        //ENTER ANIMAL SPECIES
        System.out.println("Enter animal species: ");
        String animalSpecies = scanner.nextLine();

        // STORE THE INFORMATION IN A SYSTEM


    }
    
}
