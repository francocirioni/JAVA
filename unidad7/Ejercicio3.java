package unidad7;

public class Ejercicio3 {

    public static void main(String[] args) {
        Integer numero = 15;
        System.out.print("el doble de 15 es "+doble(numero));
        System.out.print("el triple de 15 es "+triple(numero));
        
    }

     public static Integer doble(Integer numero) {
        return numero *2;
        
    }
     public static Integer triple(Integer numero) {
        return numero *3;
        
    }
    
}
