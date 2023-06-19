import java.util.ArrayList;

import java.util.Scanner;

public class Desafioalumnos {
    public static void main(String[] args) {

        boolean salir = false;
        double contador = 0;
        
       ArrayList<String> alumnos = new ArrayList<>();   // a difierencia del array esto es dinamico
       ArrayList<Double> notas = new ArrayList<>();





        while (!salir) {

            Scanner opcion = new Scanner(System.in);
            Scanner notaprincipal = new Scanner(System.in);
            Scanner nombreprincipal = new Scanner(System.in);
            System.out.println("---------------------------------");
            System.out.println("Dame un opcion");
            System.out.println("---------------------------------");
            System.out.println("a-registrar");
            System.out.println("b-mostrar alumnos");
            System.out.println("c-notas promedio");
            System.out.println("d - buscar por nombre");
            System.out.println("e-modificar nota por nombre");
            System.out.println("f-eliminar nota por alumno");
            System.out.println("g-Salir");

            int opcionpersona = opcion.nextInt();
        

            System.out.println("---------------------------------");
      

            switch (opcionpersona) {

                case 1:

                System.out.println("Dame el nombre del wachin");      

                String nombre = nombreprincipal.nextLine();

                alumnos.add(nombre);

                System.out.println("Dame la nota del wacho");

                Double notadelwacho = notaprincipal.nextDouble();

                notas.add(notadelwacho);

                System.out.println(alumnos.toString());
                System.out.println(notas.toString());                             
               
                    break;
                case 2:

                for (int i = 0 ; i < alumnos.size() ; i++){

                    System.out.println("el alumno " + alumnos.get(i) + "y su nota es " + notas.get(i));
                }
                    break;
                case 3:

                 for (int i = 0 ; i < notas.size() ; i++){

                    contador += notas.get(i);          

                    
                 }
                  Double promedio = contador/ notas.size();


                 System.out.println("las notas de los pendejos son" + notas);

                  System.out.println("el promedio de todos los chique es " + promedio.toString());

                    break;
                case 4:

                



                    break;
                case 5:
                    break;

                case 6:
                    break;
                case 7:
                    break;

            }
        }

    }
}
