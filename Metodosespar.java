import java.util.Scanner;

public class Metodosespar {
    public static void main(String[] args) {

         
         Integer numero = null;             

          do { numero = solicitarNumero(); }         
         
         while(numero == null); 
         
         if (esPar(numero)) { System.out.println("El "+numero+" espar"); } else {System.out.println("no es par");}
        
        }


    private static int solicitarNumero() {

        Scanner numero = new Scanner(System.in);
        System.out.println("Por favor ingrese un número:"); 
        int nuevo = numero.nextInt();
        return nuevo;

       
        
    }

       public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

}

// 1. Es par: Reemplaza la lógica de pedir un número por un método llamado
// "solicitarNumero()" que no reciba parámetros y devuelva un entero. También
// reemplaza la condición del if por un método llamado "esPar()" que reciba por
// parámetro un entero y devuelva un booleano. public static void main(String[]
// args) { Scanner pepe = new Scanner(System.in); Integer numero = null;
// System.out.println("Por favor ingrese un número:"); do { try { numero =
// pepe.nextInt(); } catch (Exception e) { pepe.nextLine();
// System.out.println("No ingresó un número, intente nuevamente:"); } } while
// (numero == null); if (numero % 2 == 0) { System.out.println("El "+numero+" es
// par"); } }