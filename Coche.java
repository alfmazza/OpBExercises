public class Coche {

    int puertas = 0;

    public int agregaPuerta() {
        return puertas++;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregaPuerta();
        System.out.println(miCoche.puertas);

    }
}
