public class Main {

    public static void main(String[] args) {
        int numeroif = 38;

        if (numeroif == 0){
            System.out.println("El número es 0");
        } else if (numeroif < 0){
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
        System.out.println("");

        int numeroWhile = -2;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        System.out.println("");

        int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 3);
        System.out.println("");

        int numeroFor[] = new int[4];
        for (int i = 0; i < numeroFor.length; i++ ) {
            numeroFor[i] = i;
            System.out.println(numeroFor[i]);
        }
        System.out.println("");

        var estacion = "Verano";
        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estación");
        }

    }


}