import java.util.Scanner;

public class ZooManagementSystem {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // declaring variables 
        String[] animalNames= new String[20];  // an empty array
        String[] animalSpecies= new String[20];

        int choice = 0;
        int animalCount = 0; //tracks how many animals exists

        System.out.println("Welcome to the Zoo Management System");
        // add a while loop
        while(choice != 3){
        // FEATURE 1
        System.out.println("menu");
        System.out.println("1. View Animals");
        System.out.println("2. Search Animals");
        System.out.println("3. Exit");
        choice = scanner.nextInt();
        // Scanner scanner input


        switch(choice){
            case 1: 
                System.out.println("Animals in the zoo: ");

                // user selects view animals
                if(animalCount == 0){
                    System.out.println("No animals added yet.");
                }else{
                    for(int i = 0; i < animalCount; i++){
                        // print animals names and species that exists
                        System.out.println(animalNames[i] + " - " + animalSpecies[i]);
                    }
                }
                break;

            case 2:
                System.out.println("Add animal selected:");
                scanner.nextLine();

                // Storing data in variables

                System.out.println("Enter animal name");
                String name = scanner.nextLine();
                animalNames[animalCount] = name; //store name 

                System.out.println("Enter animal species: ");
                String species = scanner.nextLine();
                animalSpecies[animalCount]=species; // store animal species

                animalCount++;

                System.out.println("\nAnimal Added:");
                
                System.out.println("Name: " + name);
                System.out.println("Species " + species);

                break;
                
            
            case 3:
                System.out.println("Exiting program...");
                break;
            
            default:
                System.out.println("Invalid option");
        }

        }
        


    }
    
}
