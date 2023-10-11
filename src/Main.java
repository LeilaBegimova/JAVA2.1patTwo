// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Swan objectA = new Swan(  "  шипун  ", 2,2,2,Color. WHAIT);
        Crow objectb = new Crow("  черный ", 2,2,2,Color. BLACK);
        Crow objectc = new Crow("  коричневый ",2,2,2,Color. BROWN);
        System.out.println(objectA.getDapy() + objectA.getSpecies());
        System.out.println(objectA.getWater() + objectb.getSpecies() +objectb.getDapy() );
        System.out.println(objectA.getDapy() + objectb.getSpecies() + objectc.getDapy());
        objectA.swan();
        objectb.swan();
        objectc.swan();







    }


}