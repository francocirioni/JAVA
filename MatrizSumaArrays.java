public class MatrizSumaArrays {
    public static void main(String[] args) {

        int[][] matriz = { { 1, 2, 3 }, { 1, 2, 3 } };
        int[] array = { 0, 0, 0 };
        int[][] matrizdesuma = { { 1, 2, 3 }, { 1, 2, 3 }, array };

        int numero = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                numero = matriz[i][j] + array[j];
                array[j] = numero;
            }
        }

     //////////////////////////////////////imprimo matriz

        for (int i = 0; i < matrizdesuma.length; i++) {
            for (int j = 0; j < matrizdesuma[i].length; j++) {
                System.out.print(matrizdesuma[i][j] );
            }
            System.out.println();
        }

    }

}
