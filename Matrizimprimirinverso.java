public class Matrizimprimirinverso {

    public static void main(String[] args) {

        int[][] matriz = { { 5, 3, 2 }, { 6, 5, 9 }, { 8, 1, 5 }, { 9, 5, 6 } };

        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
