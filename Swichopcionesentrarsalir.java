import java.util.Scanner;



public class Swichopcionesentrarsalir {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 para guardar");
        System.out.println("2 cargar");
        System.out.println("3 para salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                  System.out.println("guardaste");

                break;
            case 2:

                      System.out.println("cargaste");
                break;
            case 3:
                  System.out.println("saliste");
                break;

        }

        scanner.close();
    }

}
