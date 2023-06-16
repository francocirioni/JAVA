
import java.util.Arrays;

public class ForInvertirArray {


    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int[] arrayInvertido = invertirArray(arrayOriginal);
        System.out.println(Arrays.toString(arrayInvertido));
    }

    public static int[] invertirArray(int[] array) {
        int longitud = array.length;
        int[] arrayInvertido = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            arrayInvertido[i] = array[longitud - 1 - i];
        }

        return arrayInvertido;
    }
}

