import java.util.Scanner;

public class DesafioComprobarcontrase {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una contraseña: ");
        String password = scanner.nextLine();



        if(password.matches(".*[A-Z].*") &&  password.matches(".*[a-z].*") && password.matches(".*[^a-zA-Z\\d].*" ) && password.length() > 8 ) {

                     System.out.println("La contraseña es segura.");

        } else {          System.out.println("La contraseña no cumple con los criterios de seguridad.");}




        scanner.close();
    }


}
