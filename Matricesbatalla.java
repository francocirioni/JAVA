import java.util.Arrays;
import java.util.Scanner;

public class Matricesbatalla {

    public static void main(String[] args) {

        char[][] pc = new char[4][4];
    
        char[] simbolos = { '=', '~' };
        int contadorpc = 0;
        int contadorpcmax=4;
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int cordx = 0 ;
        int cordy = 0 ;

        int contadortiradasapc= 0;   
        

        for (int i = 0; i < pc.length; i++) {

            for (int j = 0; j < pc[i].length; j++) {

                if (contadorpc <= contadorpcmax) {
                    int randomIndex = (int) (Math.random() * simbolos.length);
                    pc[i][j] = simbolos[randomIndex];
                    if (pc[i][j] == '=') {
                        contadorpc++;
                    }
                    ;
                } else {pc[i][j] = '~';}

            }

            System.out.println(Arrays.toString(pc[i]));

        }

        System.out.println("-------------------------------------------------------");

      




        while(contadortiradasapc < 3){


        System.out.println("dame una cordenada x");
        cordx= x.nextInt();        
        System.out.println("dame una cordenada y");
        cordy= y.nextInt();

        if (pc[cordy][cordx] == '='){
         
            System.out.println("le pegaste");
            pc[cordy][cordx] = 'X';
        
            contadortiradasapc++;

               System.out.println(" le pegaste estas veces " + contadortiradasapc);



        }



        }

        if (contadortiradasapc == 3){System.out.println("le ganaste al pc");}
        else {System.out.println("no le ganaste al pc");}

        x.close();
        y.close();





        














    }
}