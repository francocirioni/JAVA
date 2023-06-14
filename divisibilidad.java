import java.util.Scanner;

public class divisibilidad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("dame un numero");
        int numero = scanner.nextInt();
        scanner.close();

       

        if( numero % 5 == 0 && numero % 3 == 0){
            System.out.println("es divisible por ambos");
        }
        else if( numero % 5 == 0){
            System.out.println("es divisible solo por 5");
        }
          else if( numero % 3 == 0){
            System.out.println("es divisible solo por 3");
        }
          else{
            System.out.println("no es divicible por ninguno");
        }

    }

}
