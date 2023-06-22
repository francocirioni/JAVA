public class Matrizesparoimpar {
    public static void main(String[] args) {
        
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 6, 3 };
        int[][] matriz = { array1, array2 };
    
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {           


                if (matriz[i][j] % 2 == 0) {
                    pares += 1;
                    
                    
                } else {
                    impares += 1;
    
                }

            }

        }

        System.out.println(pares);
        System.out.println(impares);


    }
    }
    
