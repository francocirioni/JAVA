public class MatricesmaximoyMin {

    public static void main(String[] args) {

        int[] array1 = { 2, 4, 3 };
        int[] array2 = { 4, 6, 3 };
        int[][] matriz = { array1, array2 };

        int numero = 0;
        int numero2 = 10000;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > numero) {

                    numero = matriz[i][j];

                }

            }

        }

        System.out.println("el maximo es " + numero);



        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] < numero2) {

                    numero2 = matriz[i][j];

                }

            }

        }

        System.out.println("el minimo es " + numero2);

    }

}
