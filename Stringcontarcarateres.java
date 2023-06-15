import java.util.Scanner;

public class Stringcontarcarateres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("dame una oracion para contar los caracteres");
        String oracion = scan.nextLine();

        int cantidadecaracteres = oracion.length();
        System.out.println("esa oracion tiene " + cantidadecaracteres);
        scan.close();
    }
    
}

//String oracion = "Hola, mundo!";
//String oracionSinEspacios = oracion.replaceAll(" ", ""); // Elimina los espacios en blanco
//int cantidadCaracteres = oracionSinEspacios.length();
//System.out.println("La cantidad de caracteres en la oración (sin espacios) es: " + cantidadCaracteres);

