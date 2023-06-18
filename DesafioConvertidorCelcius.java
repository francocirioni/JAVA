import java.util.Scanner;

public class DesafioConvertidorCelcius {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("dame la temperatura en numero");
        int numero = scanner.nextInt();

        System.out.println("es c o f");
        String letra = scanner2.nextLine();



        if (letra.equals("c")){

            int Fahrenheit = (numero * 9/5) + 32;

            System.out.println("Colocaste " + numero + " c " + " lo que equivale a " + Fahrenheit  + " F ");

        }

        else if  (letra.equals("f")){

            int  Celcius = (numero - 32  ) * 5/9 ; 

            System.out.println("Colocaste " + numero + " F " + " lo que equivale a " + Celcius + " C ");

        }
        else{  System.out.println(" colocaste mal la letra"); };

        scanner.close();
        scanner2.close();


    }
    
}

//− 32) × 5/9 