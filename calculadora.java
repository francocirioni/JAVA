import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        System.out.print("dame un numero");
        int numero1 = miScanner.nextInt();

        System.out.print("dame otro numero");
        int numero2 = miScanner.nextInt();

        System.out.print("Que queres que haga con eso 1 lo sumo, 2 lo resto, 3 multiplico 4 divido");
        int numero3 = miScanner.nextInt();

        int resultado = 0;

        if (numero3 == 1) {

            resultado = numero1 + numero2;
        }

        else if (numero3 == 2) {
            resultado = numero1 - numero2;
        }

        else if (numero3 == 3) {
            resultado = numero1 * numero2;
        }

        else if (numero3 == 4) {
            resultado = numero1 / numero2;
        }

        System.out.println(resultado);
        miScanner.close();

    }

}
