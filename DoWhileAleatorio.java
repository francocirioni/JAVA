import java.util.Random;
import java.util.Scanner;

public class DoWhileAleatorio {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numerorandom = random.nextInt(100)+1;


         System.out.println("dame un numero de el 0 al 100");
        int elegido = scanner.nextInt();

        do {
            System.out.println("dame otro");
             elegido = scanner.nextInt();

        
        
        if ( elegido < numerorandom){
            System.out.println("Es mas grande");
        }

        else {  System.out.println("Es mas chico"); }}



        while (elegido != numerorandom);

        scanner.close();


        // a diferencia del While que va y hasta encontrar la condicion, con el do while puedo meter una linea de codigo para que se ejecute antes





    }
    
}
