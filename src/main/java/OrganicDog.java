public class OrganicDog extends OrganicPet implements Dogs {

    int dirtiness;

    public OrganicDog(String name, String description, int health, int happiness, int hunger, int thirst, int dirtiness) {
        super(name, description, health, happiness, hunger, thirst);
        this.dirtiness = dirtiness;
    }

    public int getDirtiness() {
        return dirtiness;
    }

    @Override
    public void walk() {
        happiness ++;
        health ++;
        dirtiness --;
    }

    public void clean(){ dirtiness -= dirtiness; }

    public void tick(int time) {
        dirtiness ++;
        health --;
        happiness --;
        hunger ++;
        thirst ++;
    }
}

