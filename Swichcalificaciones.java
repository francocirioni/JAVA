import java.util.Scanner;

public class Swichcalificaciones {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("numero del 1 al 5");
        int nota = scanner.nextInt();

           switch (nota) {
            case 1:

             System.out.print("Muy deficniente");
                break;

            case 2:

                System.out.print("Deficiiente");
                break;

            case 3:
                System.out.print("Suficiente");
                break;


            case 4:
                System.out.print("Notable");
                break;

            case 5:
                System.out.print("Sobresaliente");
                break;

        
         
        }
        scanner.close();

    }
}
