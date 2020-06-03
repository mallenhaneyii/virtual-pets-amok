import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    public void admit(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public void adopt(VirtualPet pet) {
        pets.remove(pet.getName(), pet);
    }

    public VirtualPet findPetName(String name) {
        return pets.get(name);
    }

    public void cleanAllCages() {
        for (VirtualPet allPets : pets.values()) {
            if (allPets instanceof OrganicDog) {
                ((OrganicDog) allPets).clean();
            }
        }
    }

    public void playWithOnePet(String petName) {
        VirtualPet petToPlayWith = findPetName(petName);
        petToPlayWith.play(5);
    }

    public void feedAll() {
        for (VirtualPet allPets : pets.values()) {
            if (allPets instanceof OrganicPet) {
                ((OrganicPet) allPets).feed(5);
            }
        }
    }

    public void waterAll() {
        for (VirtualPet allPets : pets.values()) {
            if (allPets instanceof OrganicPet) {
                ((OrganicPet) allPets).water(5);
            }
        }
    }

    public void oilAll() {
        for (VirtualPet allPets : pets.values()) {
            if (allPets instanceof RoboticPet) {
                ((RoboticPet) allPets).oil(10);
            }
        }
    }

    public void walkDogs() {
        for (VirtualPet allPets : pets.values()) {
            if (allPets instanceof Dogs) {
                ((Dogs) allPets).walk();
            }
        }
    }

    public void showOrganicCatAttributes() {
        for (VirtualPet allPets : pets.values()) {
            if (allPets instanceof OrganicCat) {
                String name = ((OrganicCat) allPets).getName();
                String description = ((OrganicCat) allPets).getDescription();
                int health = ((OrganicCat) allPets).getHealth();
                int happiness = ((OrganicCat) allPets).getHappiness();
                int hunger = ((OrganicCat) allPets).getHunger();
                int thirst = ((OrganicCat) allPets).getThirst();
                System.out.println(name + "    " + description + "    " + health + "      " + happiness + "       " + hunger + "     " + thirst);
            }
        }
    }

    public void showOrganicDogAttributes() {
        for (VirtualPet allPets : pets.values()) {
            if (allPets instanceof OrganicDog) {
                String name = ((OrganicDog) allPets).getName();
                String description = ((OrganicDog) allPets).getDescription();
                int health = ((OrganicDog) allPets).getHealth();
                int happiness = ((OrganicDog) allPets).getHappiness();
                int hunger = ((OrganicDog) allPets).getHunger();
                int thirst = ((OrganicDog) allPets).getThirst();
                int dirtiness = ((OrganicDog) allPets).getDirtiness();
                System.out.println(name + "     " + description + "     " + health + "      " + happiness + "       " + hunger + "     " + thirst + "        " + dirtiness);
            }
        }
    }

    public void showRoboticPetAttributes() {
        for (VirtualPet allPets : pets.values()) {
            if (allPets instanceof RoboticPet) {
                String name = ((RoboticPet) allPets).getName();
                String description = ((RoboticPet) allPets).getDescription();
                int health = ((RoboticPet) allPets).getHealth();
                int happiness = ((RoboticPet) allPets).getHappiness();
                int oilLevel = ((RoboticPet) allPets).getOilLevel();
                System.out.println(name + "     " + description + "      " + health + "      " + happiness + "       " + oilLevel);
            }
        }
    }

    public void showAllVirtualPetAttributes() {
        System.out.println("Organic Pets");
        System.out.println("-------------");
        System.out.println("Name     Description Health Happiness Hunger Thirst Dirtiness");
        showOrganicDogAttributes();
        showOrganicCatAttributes();
        System.out.println();
        System.out.println("Robotic Pets");
        System.out.println("-------------");
        System.out.println("Name   Description Health Happiness Oil Level");
        showRoboticPetAttributes();
    }

    public void getAllNames() {
        for (VirtualPet petValues : pets.values()) {
            String name = petValues.getName();
            System.out.println(name);
        }
    }

    public void tick(int time) {
        for (VirtualPet allPets : pets.values()) {
            if (allPets instanceof OrganicDog) {
                ((OrganicDog) allPets).tick(1);
            }
            if (allPets instanceof OrganicCat) {
                ((OrganicCat) allPets).tick(1);
            }
            if (allPets instanceof RobotDog) {
                ((RobotDog) allPets).tick(1);
            }
            if (allPets instanceof RobotCat) {
                ((RobotCat) allPets).tick(1);
            }
        }
        LitterBox.addWaste();

    }

}



