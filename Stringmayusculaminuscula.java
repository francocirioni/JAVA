import java.util.Scanner;

public class Stringmayusculaminuscula {
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        System.out.print("dame oracion con mayus y minus");
        String oracion = scan.nextLine();

        String mayusculas = oracion.toLowerCase();

        String minuscula = oracion.toUpperCase();

             System.out.print(mayusculas);
           System.out.print(minuscula);

           scan.close();





    }
}
