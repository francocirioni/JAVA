import java.util.Scanner;

public class Stringconcatenar{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("dame tu nombre");
        String nombre = scan.nextLine();
        System.out.print("dame tu aoellido");
        String apellido = scan.nextLine();

        String nombrecompleto = nombre.concat(" ").concat(apellido);

         System.out.print(" Te llamas " + nombrecompleto);
         scan.close();


    }
}