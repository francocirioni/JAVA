public class ForSumaAcumulada {


    public static void main(String[] args) {
        

       int[] array = {1, 2, 3, 4, 5};
        
        int sumaAcumulada = 0;
        
        for (int i = 0; i < array.length; i++) {
            sumaAcumulada += array[i];   //eso es suma acumulativa es el encargado de acumulalar
            array[i] = sumaAcumulada; //este se encarga de transformar el numero que tenemos en la sumaacumulada en un nuevo para la array
        }
        
        for (int elemento : array) {
            System.out.println(elemento);
        }
        }

        



        
    }
