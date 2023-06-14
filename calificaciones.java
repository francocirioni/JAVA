import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe la puntuación del alumno: ");
        int calificacion= scanner.nextInt();

        if (calificacion >= 90) {
            System.out.println("A");
        } 
        else if (calificacion >= 80) {
            System.out.println("B");
        } 
          else if (calificacion >= 70) {
            System.out.println("C");
        } 

          else if (calificacion >= 60) {
            System.out.println("D");
        } 

          else if (calificacion < 60) {
            System.out.println("F");
        } 
    scanner.close();
    }



}