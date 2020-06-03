public class OrganicCat extends OrganicPet implements Cats {

    public OrganicCat(String name, String description, int health, int happiness, int hunger, int thirst) {
        super(name, description, health, happiness, hunger, thirst);
    }

    @Override
    public void cheerUp() {
        happiness ++;
        health ++;
    }

    public void tick(int time) {
        happiness --;
        health --;
        hunger ++;
        thirst ++;
    }
}