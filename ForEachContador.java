import java.util.Scanner;

public class ForEachContador {

    public static void main(String[] args) {

      String[] array = {"a", "b", "a", "b", "v", "v", "c", "c"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("dame un caracter para decirte cuantos existen");

        String elementoelegido = scanner.nextLine();

        int contador = 0;

        for (String letra : array) {
            if (elementoelegido.equals(letra)){
                contador++;
            }
            
        }

        System.out.println(contador);

        scanner.close();

        

    }
    
}
