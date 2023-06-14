import java.util.Scanner;

public class MiPrograma {

    


 
    public static void main(String[] args) {

      
    Scanner miScanner = new Scanner(System.in);
    System.out.print("Ingrese nombre: ");
    String nombre = miScanner.nextLine();
    System.out.print("ingresa tu edad");
    int edad = miScanner.nextInt();
    System.out.println("Te llamas " + nombre + " y tienes " + edad);
    miScanner.close();

    




        
    }

}