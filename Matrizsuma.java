

public class Matrizsuma {

    public static void main(String[] args) {       

        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 3 };
        int [][] matriz = {array1,array2};
        int suma = 0;

         for(int i = 0 ; i < matriz.length ; i++) {

              for(int j = 0 ; j < matriz[i].length ; j++) {

                suma += matriz[i][j];

              }
 
        }

                   System.out.println(suma);





    }
    
}
