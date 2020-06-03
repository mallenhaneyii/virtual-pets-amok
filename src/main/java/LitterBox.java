public class LitterBox {

    private static int waste;

    public LitterBox(int waste) {
        this.waste = waste;

    }

    public int getWaste() {
        return waste;
    }

    public static void addWaste() { waste ++; }

    public void cleanLitterBox() {
        waste -= waste;
    }
}
