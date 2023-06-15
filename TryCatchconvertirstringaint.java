
import java.util.Scanner;

public class TryCatchconvertirstringaint{

    public static void main(String[] args) {
        

        Scanner miscan = new Scanner(System.in);
        System.out.println("dame un numero para convertir a int");
        String numeroaconvertir = miscan.nextLine();

        try{
            int nuevo = Integer.parseInt(numeroaconvertir);
             System.out.println(nuevo);
            

        } catch (NumberFormatException e){
             System.out.println("no es un numero valido");
        }

        miscan.close();

    }

}