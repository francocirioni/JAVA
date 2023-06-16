import java.util.Scanner;

public class RepasoPrimos {

    public static void main(String[] args) {

    int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce un número: ");
            numero = scanner.nextInt();
      

        } while (!esPrimo(numero));

        System.out.println("¡Has introducido un número primo!");

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }




    }
    

