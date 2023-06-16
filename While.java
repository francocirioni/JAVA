import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt() ;

        int cifras = 0;

        if (numero == 0){ cifras = 1;}

        if (numero < 0 ){ numero = Math.abs(numero);} // math abs sinver para convertir numeros en absolutos.
       

        while (numero > 0){

            numero = numero /10;
            cifras ++;
        }

        System.out.println(cifras + " son las que tiene de cifras");
        scanner.close();
        
    }}

