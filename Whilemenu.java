import java.util.Scanner;

public class Whilemenu {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(" seleccion opcion ");
               System.out.println("1 - nuevo");
             System.out.println("2 - cargar");
              System.out.println("3 - guardar");
               System.out.println("4 - otro");
                System.out.println("5 - salir");
        int opcion = scanner.nextInt();

        while (opcion != 5 ) {

            System.out.println("1 - nuevo");
             System.out.println("2 - cargar");
              System.out.println("3 - guardar");
               System.out.println("4 - otro");
                System.out.println("5 - salir");
                  opcion = scanner.nextInt();

               
            
        }

            System.out.println("gracias por venir");

            scanner.close();
    }
    
}
