import java.util.Scanner;

public class Metodoscrearmatriz {

     public static void main(String[] args) {

        Scanner alto = new Scanner(System.in);
        Scanner ancho = new Scanner(System.in);
        Scanner ini = new Scanner(System.in);
        Scanner fina = new Scanner(System.in);
        System.out.println("dame el alto");
        int alt = alto.nextInt(); 
        System.out.println("dame el ancho");
        int anch = ancho.nextInt(); 
         System.out.println("dame para llenar numero minimo");
        int inicio = ini.nextInt(); 
         System.out.println("dame  para llenar numero maximo ");
        int finaliza = fina.nextInt(); 

       
        
        int [][]matriz =crearMatriz(alt,anch);

        llenarMatriz(matriz,inicio,finaliza);

        imprimirMatriz(matriz);          }



    private static int[][] crearMatriz (int alto, int ancho) {

        int [][] matriz = new int [alto][ancho];
        return matriz;
       
        
    }

     private static void llenarMatriz(int[][] matriz, int inicio, int finaliza) {

        int rangoinicial = inicio ;
        int rangofinal= finaliza;

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
           matriz[i][j]= (int) (Math.random()*(rangofinal -rangoinicial + 1)) + rangoinicial;      //(Math.random() * (rangoFinal - rangoInicial + 1)) + rangoInicial;
        }
     
    }}



    private static void imprimirMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    
}}
