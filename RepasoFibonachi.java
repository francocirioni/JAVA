import java.util.Arrays;

public class RepasoFibonachi {

    public static void main(String[] args) {
        
       int [] array = {0,1,2};
       int logitud = array.length;

       while (logitud < 9) {

        int ultimo = array[array.length - 1];
        int anteultimo = array[array.length - 2];
        int nuevo = ultimo + anteultimo;      




        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length); //lo que hace es crear otro array que copie el anterior
        newArray[array.length] = nuevo; //al nuevo array le mete el valor de nuevo al final
        array = newArray; //convierte a newarray en arrar

        logitud++;
        

        
       }

   System.out.println(Arrays.toString(array));

     

    }
    
}
