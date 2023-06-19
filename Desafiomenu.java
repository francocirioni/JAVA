import java.util.Arrays;
import java.util.Scanner;

public class Desafiomenu {
    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        Scanner creadororacion = new Scanner(System.in);
        Scanner eligepalabra = new Scanner(System.in);
        Scanner palabraabuscar = new Scanner(System.in);
        Scanner palabraabuscar2 = new Scanner(System.in);
        Scanner nuevaacambiar = new Scanner(System.in);
        Scanner nuevaacambiar3 = new Scanner(System.in);
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
            System.out.println("7 - modifico palabra");
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

                    int count = 0;
                    for (int i = 0; i < oracion.length; i++) {
                        count += String.valueOf(oracion[i]).length(); // el valueof sirve para convertirlo a cadena de
                                                                      // caracteres
                    }
                    System.out.println("Cantidad de caracteres: " + count);

                    break;
                case 3:

                    System.out.println("la oracion tiene" + oracion.length);

                    break;
                case 4:

                    Arrays.sort(oracion);

                    System.out.println(oracion);

                    break;
                case 5:
                    System.out.println("QUE NUMERO DE LUGAR QUERES");
                    int eleccion = eligepalabra.nextInt();

                    if (eleccion <= oracion.length) {

                        System.out.println(oracion[eleccion - 1]);

                    } else {
                        System.out.println("la oracion no tiene tantas palabras o no existe oracion");
                    }

                    break;

                case 6:

                    System.out.println("Ingrese la palabra a buscar:");
                    String palabra = palabraabuscar.nextLine();

                    boolean encontrada = false;
                    int posicion = -1;

                    for (int i = 0; i < oracion.length; i++) {
                        if (oracion[i].equals(palabra)) {
                            encontrada = true;
                            posicion = i;

                        }
                    }

                    if (encontrada) {
                        System.out.println("La palabra \"" + palabra + "\" fue encontrada en la posición " + posicion);
                    } else {
                        System.out.println("La palabra \"" + palabra + "\" no fue encontrada en la oración.");
                    }

                    break;
                case 7:

                   System.out.println("la oracion actual es " + oracion);

                    System.out.println("Ingrese la palabra a cambiar:");
                    String palabra2 = palabraabuscar2.nextLine();
                    int posicion2 = 0;


                    for (int i = 0; i < oracion.length; i++) {
                        if (oracion[i].equals(palabra2)) {
                            posicion2 = i;
                        }
                    }


                      System.out.println("cambias" + palabra2 + "a :");

                    String nuevo = nuevaacambiar.nextLine();
                    oracion [posicion2] = nuevo;

                    System.out.println(oracion);





                break;

                case 8:

                int lugar = oracion.length -1;

                System.out.println("que pongo al final de la lista");
                
                String palabraalfinal = nuevaacambiar3.nextLine();

                oracion [lugar] = palabraalfinal;
                
                
                System.out.println(" la oracion te quedo " + oracion);




                    break;

                case 9:
                    salir = true;
                    break;
            }



        }
        System.out.println("PROGRAMA TERMINADO");
        menu.close();
        creadororacion.close();
        eligepalabra.close();
        palabraabuscar.close();
        palabraabuscar2.close();
        nuevaacambiar.close();
        nuevaacambiar3.close();










    }

}