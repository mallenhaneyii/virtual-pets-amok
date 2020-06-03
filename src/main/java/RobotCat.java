public class RobotCat extends RoboticPet implements Cats {

    public RobotCat(String name, String description, int health, int happiness, int oilLevel) {
        super(name, description, health, happiness, oilLevel);
    }

    @Override
    public void cheerUp() {
        happiness++;
    }

    public void tick(int time) {
        happiness--;
        health --;
        oilLevel--;
    }
}


