import java.util.Scanner;

public class TryCatchdivicion {
 public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);
    System.out.print("dame un numero");
    int numero1 = scanner.nextInt();
    System.out.print("dame otro numero");
    int numero2 = scanner.nextInt();


    try{   
        int resultado = numero1 % numero2  ; 
        System.out.print("el resultado es " + resultado);}

    catch (ArithmeticException exception)
    {     System.out.print("no se puede dividir"); }


 

  

    scanner.close();
    }
    
}
