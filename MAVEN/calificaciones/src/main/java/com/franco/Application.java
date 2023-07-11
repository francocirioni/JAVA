package com.franco;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner califica = new Scanner(System.in);

        System.out.println("dame un numero de nota");

        int nota = califica.nextInt();

        calificaciones(nota);


        califica.close();
        
    }

 private static void calificaciones(int calif) {
    if (calif >= 100) {
        System.out.println("A");
    } else if (calif >= 89) {
        System.out.println("B");
    } else if (calif >= 79) {
        System.out.println("C");
    } else if (calif >= 69) {
        System.out.println("G");
    } else {
        System.out.println("F");
    }
}

}
