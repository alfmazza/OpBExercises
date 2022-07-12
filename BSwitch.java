public class BSwitch {

    public static void main(String[] args) {

        String estacion = "";

        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("El texto ingresado no corresponde con una estación");
        }
    }
}