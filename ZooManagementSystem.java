import java.util.Scanner;

public class ZooManagementSystem {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // declaring variables 
        // String[] animalNames= new String[20];  // an empty array
        // String[] animalSpecies= new String[20];

        Animal[] animals = new Animal[20];

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
        choice = scanner.nextInt(); // Scanner scanner input
        scanner.nextLine();// clear newline


        switch(choice){
            case 1: 
                System.out.println("Animals in the zoo: ");

                StringBuilder list =new StringBuilder();

                // using string builders to display animals

                list.append("Animal List\n");
                list.append("--------------------\n");

                // user selects view animals
                if(animalCount == 0){// if the zoo is empty
                    list.append("No animals added yet.\n");

                }else{
                    for(int i = 0; i < animalCount; i++){

                        // print animals names and species that exists
                        list.append("Name: ").append(animals[i].name).append("\n");
                        list.append("Species: ").append(animals[i].species).append("\n");

                    }
                }
                System.out.println(list.toString());
                break;

            case 2:
                if(animalCount >= animals.length){ //checks for space
                    System.out.println("Zoo is full. cannot add more animals.");
                    break;
                }

                // Storing data in variables

                System.out.println("Enter animal name");
                String name = scanner.nextLine();
                

                System.out.println("Enter animal species: ");
                String species = scanner.nextLine();
                
                //create an animal object
                Animal animal = new Animal(name, species);
                animal.name = name;
                animal.species = species;

                animals[animalCount] = animal;
                animalCount++; //incremeant the count after adding

                System.out.println("\nAnimal Added:");
                
                System.out.println("Name: " + animal.name);
                System.out.println("Species " + animal.species);
                break;

            case 3:
                System.out.println("Enter animal name to search: ");
                String searchedAnimal = scanner.nextLine();

                boolean found = false;

                for(int i =0; i< animalCount; i++){
                    if(animals[i].name.equalsIgnoreCase(searchedAnimal)){
                        System.out.println("Animal found");
                        System.out.println("Name: " + animals[i].name);
                        System.out.println("Species: " + animals[i].species);

                        found = true;
                        break;
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

        scanner.close();

    }
    
}
