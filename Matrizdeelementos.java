import java.util.Arrays;

public class Matrizdeelementos {

    public static void main(String[] args) {

        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 3 };
        int[] array3 = { 1, 2, 3 };

        int[][] matriz = { array1, array2, array3 };


          for(int i = 0 ; i < matriz.length ; i++) {
            System.out.println(Arrays.toString(matriz[i]));}


        System.out.println("["+array1[0]+"]"+"["+array1[1]+"]"+"["+array1[2]+"]");
        System.out.println("["+array2[0]+"]"+"["+array2[1]+"]"+"["+array2[2]+"]");
        System.out.println("["+array3[0]+"]"+"["+array3[1]+"]"+"["+array3[2]+"]");
           
  
 
     
    }

  
}




