public class ArrayMaximo {
    public static void main(String[] args) { 

        int [] array =  {3,5,2};

        int max = Math.max(array[0], Math.max(array[1], array[2])); 

        System.out.println("Valor máximo: " + max);

    }
   
    
}
