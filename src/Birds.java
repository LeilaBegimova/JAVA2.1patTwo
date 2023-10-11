public class Birds {
    private String species;
    private int   water;

    public int getWater() {
        return water;
    }

    public Birds(String species, int beak, int dapy, int wings, Color color) {
    }

    public String getSpecies() {
        return species;
    }

    public int getWings() {
        return wings;
    }

    public Color getColor() {
        return color;
    }

    private int wings;
   private Color color;

    public Birds(String species, int wings, Color color) {
        this.species = species;
        this.wings = wings;
        this.color = color;
    }
}
