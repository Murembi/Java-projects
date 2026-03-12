import java.util.Scanner;

public class ZooManagementSystem {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // declaring variables 
        String[] animalNames= new String[20];  // an empty array
        String[] animalSpecies= new String[20];

        int choice = 0; //declaring choice
        int animalCount = 0; //tracks how many animals exists

        System.out.println("Welcome to the Zoo Management System");

        // add a while loop
        while(choice != 4){

        // FEATURE 1
        System.out.println("menu");
        System.out.println("1. View Animals");
        System.out.println("2. Add Animals");
        System.out.println("3. Search Animal"); //search for an animal 
        System.out.println("4. Exit");
        choice = scanner.nextInt();
        // Scanner scanner input


        switch(choice){
            case 1: 
                System.out.println("Animals in the zoo: ");

                StringBuilder list =new StringBuilder();

                // using string builders to display animals

                list.append("Animal List\n");
                list.append("--------------------\n");

                // user selects view animals
                if(animalCount == 0){
                    list.append("No animals added yet.\n");

                }else{
                    for(int i = 0; i < animalCount; i++){

                        // print animals names and species that exists
                        list.append("Name: ");
                        list.append(animalNames[i]);
                        list.append("\n");

                        list.append("Species: ");
                        list.append(animalSpecies[i]);
                        list.append("\n");

                    }
                }
                System.out.println(list);
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

                animalCount++; //incremeant the count after adding

                System.out.println("\nAnimal Added:");
                
                System.out.println("Name: " + name);
                System.out.println("Species " + species);

                break;

            case 3:
                System.out.println("Enter animal name to search: ");
                String searchedAnimal = scanner.nextLine();

                boolean found = false;

                for(int i =0; i<animalNames.length; i++){
                    if(animalNames[i].equals(searchedAnimal)){
                        System.out.println("Animal found");
                        System.out.println("Name: " + animalNames[i]);
                        System.out.println("Species: " + animalSpecies[i]);

                        found = true;
                    }

                }
                
                if(!found) {
                    System.out.println("Animal not found");
                } 

                break;
            
            case 4:
                System.out.println("Exiting program...");
                break;
            
            default:
                System.out.println("Invalid option");
        }

        }

    }
    
}
