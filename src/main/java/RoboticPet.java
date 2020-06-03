public abstract class RoboticPet extends VirtualPet {

    public int oilLevel;

    public RoboticPet(String name, String description, int health, int happiness, int oilLevel) {
        super(name, description, health, happiness);
        this.oilLevel = oilLevel;
    }

    public void oil(int clicks) {
        oilLevel += clicks;
        health ++;
    }

    public int getOilLevel() {
        return oilLevel;
    }

}



