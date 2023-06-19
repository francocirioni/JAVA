import java.util.Arrays;
import java.util.Scanner;

public class Desafiomenu {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        Scanner creadororacion = new Scanner(System.in);

        String[] oracion = {};
        int opcion = 0;
        Boolean salir = false;

        while (!salir) {

            System.out.println("---------------------------------------------------------------------");
            System.out.println("LA ORACION ACTUAL ES " + Arrays.toString(oracion));
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1 - crear o borrar oracion");
            System.out.println("2 - cantidad caracteres");
            System.out.println("3- cantidad de palabras");
            System.out.println("4 - ordenadas palabras");
            System.out.println("5 - ingreso numero y digo que palabra es");
            System.out.println("6 - busco si esta palabra");
            System.out.println("7 - mofico palabra");
            System.out.println("8 - agrego palabras");
            System.out.println("9 - salir");
            System.out.println("---------------------------------------------------------------------");
            opcion = menu.nextInt();

            switch (opcion) {
                case 1:

                    if (oracion.length == 0) {

                        System.out.println("Dame una nueva oracion");
                        String crear = creadororacion.nextLine();
                        String[] nuevaoracion = crear.split(" ");
                        oracion = nuevaoracion;

                        System.out.println("creaste la siguiente oracion" + Arrays.toString(oracion));

                    }

                    else {
                        String[] nuevaoracion2 = {};
                        oracion = nuevaoracion2;
                        System.out.println("Borraste la oracion");

                    }
                    ;

                    break;
                case 2:

                    break;
                case 3:

                  System.out.println("la oracion tiene" + oracion.length);
                  



         
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                case 8:

                    break;

                case 9:
                    salir = true;
                    break;
            }

        }
        System.out.println("PROGRAMA TERMINADO");
    }

}