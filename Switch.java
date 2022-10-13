public class Switch {

    public static void main(String[] args) {

        var estacion = "otoño";

        switch (estacion) {
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
            default:
                System.out.println("No es una estación");

        }
    }
}

