import java.util.Scanner;

public class MetodosCalculadora {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);
          Scanner o1 = new Scanner(System.in);
            Scanner o2 = new Scanner(System.in);
        boolean quieresalir = false;
        int opcion;
        int numero1;
        int numero2;
        int resultado;

        while (quieresalir == false) {

            menu();
            System.out.println("que opcion quieres");
            opcion = op.nextInt();

            switch (opcion) {

                case 1:
                System.out.println("dame el primer numero");
                numero1 = o1.nextInt();
                  System.out.println("dame el segundo numero");
                numero2 = o2.nextInt();

                resultado=numero1+numero2;

                System.out.println(resultado);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:

                quieresalir=true;
                    break;

            }

        }

        System.out.println("saliste");

    }

    private static void menu() {

        System.out.println("1-suma");
        System.out.println("2-multi");
        System.out.println("3-resta");
        System.out.println("4-div");
        System.out.println("5-Salir");

    }

}
