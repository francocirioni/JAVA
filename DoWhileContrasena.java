import java.util.Scanner;

public class DoWhileContrasena {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pass = "secreto";

        String ingreso = "cualquier cosa";

        
        do {
            System.out.println("Ingrese la contraseña:");
            ingreso = scanner.nextLine();

            if (!ingreso.equals(pass)) {
                System.out.println("Denegado");
                System.out.println("Reintente");
            }
        } while (!ingreso.equals(pass));

        System.out.println("Acceso concedido");
        scanner.close();
    

    }

}
