import java.util.Scanner;

public class VirtualPetsAmokApp {

    private static Object OrganicPet;

    public static void main(String[] args) {
        VirtualPetShelter myShelter = new VirtualPetShelter();
        LitterBox catsLitterBox = new LitterBox(0);
        Scanner input = new Scanner(System.in);
        int userAction = 0;

        myShelter.admit(new OrganicDog("Jake", "Black Lab", 10, 10, 10, 10, 0));
        myShelter.admit(new OrganicCat("Patches", "Calico", 10, 10, 10, 10));
        myShelter.admit(new RobotDog("Zoomer", "Zinc", 10, 10, 10));
        myShelter.admit(new RobotCat("Boomer", "Gold", 10, 10, 10));

        System.out.println("");
        System.out.println("");
        System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter!\n" +
                "You'll find the pets status' below, as well as the status\n" +
                "of the Pet Shelter litter box.");
        System.out.println("");

        while (userAction != 99) {

            System.out.println("This is the status of your pets:");
            System.out.println("");
            myShelter.showAllVirtualPetAttributes();
            System.out.println("");
            System.out.println("Litter Box Level: " + catsLitterBox.getWaste());
            System.out.println("");

            System.out.println("What would you like to do?");
            System.out.println("1. Feed all organic pets");
            System.out.println("2. Water all organic pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Oil all robotic pets");
            System.out.println("5. Walk all the dogs");
            System.out.println("6. Clean the dog cages");
            System.out.println("7. Clean the litter box");
            System.out.println("8. Adopt a pet");
            System.out.println("9. Admit an Organic Dog");
            System.out.println("10. Admit an Organic Cat");
            System.out.println("11. Admit a Robotic Dog");
            System.out.println("12. Admit a Robotic Cat");
            userAction = input.nextInt();
            input.nextLine();

            if (userAction == 1) {
                myShelter.feedAll();
                System.out.println("You gave all the pets food!");
                System.out.println("Their hunger decreased by 5!");
            } else if (userAction == 2) {
                myShelter.waterAll();
                System.out.println("You gave all the pets water!");
                System.out.println("Their thirst decreased by 5!");
            } else if (userAction == 3) {
                System.out.println("Which pet would you like to play with?");
                myShelter.getAllNames();
                String userInput = input.nextLine();
                System.out.println("You played with " + userInput + "!");
                System.out.println(userInput + "'s happiness increased by 5!");
                myShelter.playWithOnePet(userInput);
            } else if (userAction == 4) {
                myShelter.oilAll();
                System.out.println("You oiled all the robotic pets!");
                System.out.println("They no longer need oil!");
            } else if (userAction == 5) {
                myShelter.walkDogs();
                System.out.println("You walked all of the dogs!");
                System.out.println("Their happiness increased by 5!");
            } else if (userAction == 6) {
                myShelter.cleanAllCages();
                System.out.println("You cleaned all the dogs cages!");
                System.out.println("The dogs are no longer dirty!");
            } else if (userAction == 7) {
                catsLitterBox.cleanLitterBox();
                System.out.println("You cleaned the litter box!");
                System.out.println("There is no waste in the litter box!");
            } else if (userAction == 8) {
                System.out.println("You would like to adopt a pet. Which pet would you like to adopt?");
                myShelter.getAllNames();
                String userInput = input.nextLine();
                System.out.println("Thank you for adopting " + userInput);
                myShelter.adopt(myShelter.findPetName(userInput));
            } else if (userAction == 9) {
                System.out.println("What is the name of your pet?");
                String petName = input.nextLine();
                System.out.println("What is your pets description?");
                String petDescription = input.nextLine();
                myShelter.admit(new OrganicDog(petName, petDescription, 10, 10, 10, 10, 10));
                System.out.println("We will take good care of " + petName);
            } else if (userAction == 10) {
                System.out.println("What is the name of your pet?");
                String petName = input.nextLine();
                System.out.println("What is your pets description?");
                String petDescription = input.nextLine();
                myShelter.admit(new OrganicCat(petName, petDescription, 10, 10, 10, 10));
                System.out.println("We will take good care of " + petName);
            } else if (userAction == 11) {
                System.out.println("What is the name of your pet?");
                String petName = input.nextLine();
                System.out.println("What is your pets description?");
                String petDescription = input.nextLine();
                myShelter.admit(new RobotDog(petName, petDescription, 10, 10, 10));
                System.out.println("We will take good care of " + petName);
            } else if (userAction == 12) {
                System.out.println("What is the name of your pet?");
                String petName = input.nextLine();
                System.out.println("What is your pets description?");
                String petDescription = input.nextLine();
                myShelter.admit(new RobotCat(petName, petDescription, 10, 10, 10));
                System.out.println("We will take good care of " + petName);
            } else if (userAction == 99) {
                System.out.println("");
                System.out.println("Thank you for your help today! Goodbye.");
                break;
            }
            myShelter.tick(1);
        }
    }
}




