import java.util.Scanner;

public class SwichDiasSemana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("numero del 1 al 7");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:

             System.out.print("ese numero corresponde al lunes");
                break;

            case 2:

                System.out.print("ese numero corresponde al martes");
                break;

            case 3:
                System.out.print("ese numero corresponde al mierco");
                break;

            case 4:
                System.out.print("ese numero corresponde al jue");
                break;

            case 5:
                System.out.print("ese numero corresponde al vier");
                break;

            case 6:
                System.out.print("ese numero corresponde al Sab");
                break;
             case 7:
                System.out.print("ese numero corresponde al DOm");
                break;

         
        }
        scanner.close();

    }
}