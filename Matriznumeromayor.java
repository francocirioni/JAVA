public class Matriznumeromayor {

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 6, 3 };
        int[][] matriz = { array1, array2 };
    
        int numero = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {           



               if (  matriz [i][j] > numero ){

                numero = matriz[i][j];

               }

            }

        }

        System.out.println(numero);

    }

}
