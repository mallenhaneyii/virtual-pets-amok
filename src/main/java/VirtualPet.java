public abstract class VirtualPet {

    public String name;
    public String description;
    public int health;
    public int happiness;

    public VirtualPet(String name, String description, int health, int happiness) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.happiness = happiness;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public void play(int toy){
        happiness += toy;
        health += 5;}

}
