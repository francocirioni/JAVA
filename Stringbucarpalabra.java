
import java.util.Scanner;

public class Stringbucarpalabra {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("dame una palabra");
        String palabra = s.nextLine();
          
    
        System.out.println("dame un caracter");
        String caracter = s.nextLine();

        if (palabra.indexOf(caracter)!= -1){
            
                 System.out.println("es parte de esa palabra");
            
        } else { System.out.println("no es parte de esa palabra");}

        s.close();

    };

}
