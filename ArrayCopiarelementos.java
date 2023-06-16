import java.util.Arrays;

public class ArrayCopiarelementos {

    public static void main(String[] args) {

        int[] arrayOriginal = { 1, 2, 3 };

        int[] arrayExtendido = new int[arrayOriginal.length + 2];

        System.arraycopy(arrayOriginal, 0, arrayExtendido, 0, arrayOriginal.length);

        System.out.println(Arrays.toString(arrayExtendido));

    }

}

// arrayOriginal: Es el array de origen del cual se copiarán los elementos.
// 0: Es la posición inicial en el arrayOriginal desde donde se comenzará a
// copiar los elementos. En este caso, se utiliza 0 para copiar desde la primera
// posición del arrayOriginal.
// arrayExtendido: Es el array de destino al cual se copiarán los elementos.
// 0: Es la posición inicial en el arrayExtendido donde se comenzarán a copiar
// los elementos. En este caso, se utiliza 0 para copiar desde la primera
// posición del arrayExtendido.
// arrayOriginal.length: Es la longitud o cantidad de elementos que se copiarán
// desde el arrayOriginal al arrayExtendido. En este caso, se utiliza
// arrayOriginal.length para copiar todos los elementos del arrayOriginal.