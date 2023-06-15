import java.util.Scanner;

public class Stringextraccion {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        
        System.out.print("Ingresa el índice inicial: ");
        int indiceInicial = scanner.nextInt();
        
        System.out.print("Ingresa el índice final: ");
        int indiceFinal = scanner.nextInt();
        
        String subcadena = frase.substring(indiceInicial, indiceFinal);
        System.out.println("Subcadena: " + subcadena);

        scanner.close();



    }
    
}
