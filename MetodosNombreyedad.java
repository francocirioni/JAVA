import java.util.Scanner;

public class MetodosNombreyedad {


    public static void main(String[] args) {

        Scanner nam = new Scanner(System.in);
        Scanner ag = new Scanner(System.in);
        System.out.println("dame tu nombre");
        String nombre = nam.nextLine();
        System.out.println("dame tu edad");
        int edad = ag.nextInt();
        imprimenombre(nombre,edad);
        

        nam.close();
        ag.close();
        


        
    }

    private static void imprimenombre  (String name, int age) {

        System.out.println(" mi nombre " + name + "mi edad " + age);
        
    }
    
}
