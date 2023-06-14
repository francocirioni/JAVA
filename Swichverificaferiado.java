import java.util.Scanner;

public class Swichverificaferiado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("decime que dia estas del 1 al 7");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1,2,3,4,5:

              System.out.println("es dia habil");

                
                break;
        
            default:
            
              System.out.println("no es dia habil");
                break;
        }

        scanner.close();
    }
    
}
