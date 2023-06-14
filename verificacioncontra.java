import java.util.Scanner;

public class verificacioncontra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Crea tu contra");

        String password = scanner.nextLine();

        System.out.println("contra creada");
        System.out.println("coloque su contra para entrar");
        String password2 = scanner.nextLine();

        if(password.equals(password2)){
            System.out.println("acceso");
        }else {   System.out.println("denegado");}

        scanner.close();
    }

}
