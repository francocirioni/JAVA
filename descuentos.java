import java.util.Scanner;

public class descuentos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

         System.out.print("cual es el precio");

         int precio = scanner.nextInt();

         if( precio >= 100){

           double nuevoprecio = precio * 0.9;

                System.out.print("tenes descuento y tu nuevo precio es " + nuevoprecio);



         } else {   System.out.print("No tenes descuentos tenes que pagar " + precio);}

         scanner.close();


    }
    
}
