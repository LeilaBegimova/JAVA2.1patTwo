public  final class Crow extends  Swan {
    private int beak;

    public int getBeak() {
       return beak;
    }
    public Crow(String species, int beak, int dapy, int wings, Color color) {
        super(species, beak, dapy, wings, color);
    }
    public void crow () {
        System.out.println("Crow spesies" + getSpecies());
        System.out.println("Crow break" + getBeak());
        System.out.println("Crow wings" + getWings());
        System.out.println("Crow color" + getColor());
    }
    @Override
    public void swan( Swan swan){
        System.out.println( "Helo");
    }

}
