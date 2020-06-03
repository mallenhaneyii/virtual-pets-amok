public abstract class OrganicPet extends VirtualPet {

    public int hunger;
    public int thirst;

    public OrganicPet(String name, String description, int health, int happiness, int hunger, int thirst) {
        super(name, description, health, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void feed(int food) {
        hunger -= food;
        happiness ++;
        health ++;
    }

    public void water(int liquid) {
        thirst -= liquid;
        happiness ++;
        health ++;
    }

}
