public class Switch {

    public static void main(String[] args) {

        var estacion = "otoño";

        switch (estacion) {
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
            default:
                System.out.println("No es una estación");

        }
    }
}

