package com.example;

import com.example.Enums.Dias;

public class Application {

    public static void main(String[] args) {

       Dias diae = Dias.VIERNES;
       Dias [] dias = Dias.values();   
       for (Dias dia : dias) {
        System.out.println(dia);}        
        sabersieslaboral(diae);     
    }


    public static void sabersieslaboral(Dias diae) {
        switch (diae) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println(diae.getLaboral()+"Es laboral");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println(diae.getLaboral() + "Es laboral");
                break;
            
        }
    }
        
    }

