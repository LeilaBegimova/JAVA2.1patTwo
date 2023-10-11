public class Swan extends Birds {
    private int dapy;

    public int getDapy() {
        return dapy;
    }

    public Swan(String species, int beak, int dapy, int wings, Color color) {
        super(species, beak, dapy, wings, color);
    }
    public void swen (){
        System.out.println("Swan spesies"  + getSpecies());
        System.out.println("Swan break"  + getDapy());
        System.out.println("Swan wings" + getWings());
        System.out.println("Swan color" + getColor());
    }


    public final void swan() {

    }

    public void swan(Swan swan) {

    }
}


