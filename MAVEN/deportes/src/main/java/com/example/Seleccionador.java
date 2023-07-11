package com.example;

import java.util.Scanner;

public class Seleccionador {


    
    public Seleccionador(){

        System.out.println("Dame un número:");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

       boolean salir = false;

      do {

        switch (opcion) {
            case 1:
            
            System.out.println("cara de caca");

                break;
        
            default:
                break;
        }
        
       } while (!salir==false);


    }

    
}
