import java.util.Scanner;

public class ArrayBuscarElemento {

    public static void main(String[] args) {

         int[] array = {5, 2, 7}; 
        
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
     
        if (numero == array[0] || numero == array[1] || numero == array[2]) {
            System.out.println("El número está presente en el array.");  }
         else {
            System.out.println("El número no está presente en el array.");
        }
                
        scanner.close();
    }
    
}
