import java.util.Arrays;

public class Matriz {


    public static void main(String[] args) {
        
        int [] array = {3,4,5};

        int [][] Matriz1 = {array , {1,2,3}};

        System.out.println(Matriz1[1][2]);

        int[][] Matriz2 = new int[2][4]; //esto es creame 2 arrasys que dentro tengan 4 elementos;

        //para recorrerlo

        for(int i = 0 ; i < Matriz2.length ; i++) {
            System.out.println(Arrays.toString(Matriz2[i]));
        }

        //si quiero rellenarla ...esto es i se mantiene costante hasta que terminan las j

         for(int i = 0 ; i < Matriz2.length ; i++) {

              for(int j = 0 ; j < Matriz2[i].length ; j++) {

                Matriz2[i][j]= (int) (Math.random()*9 + 1);

              }

            System.out.println(Arrays.toString(Matriz2[i]));
        }

        





    }
}