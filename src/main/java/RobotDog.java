public class RobotDog extends RoboticPet implements Dogs {

    public RobotDog(String name, String description, int health, int happiness, int oilLevel) {
        super(name, description, health, happiness, oilLevel);
    }

    @Override
    public void walk() {
        happiness ++;
        health ++;
        oilLevel--;
    }

    public void tick(int time) {
        health --;
        happiness--;
        oilLevel--;
    }
}

