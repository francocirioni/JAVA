package com.franco;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner alto = new Scanner(System.in);
        System.out.println("dame alto");
        double altocubo = alto.nextDouble();
        Scanner ancho = new Scanner(System.in);
        System.out.println("dame ancho");
        double anchocubo = ancho.nextDouble();
        Cubo cubo1 = new Cubo(altocubo, altocubo);      
        System.out.println("Área del cubo 1: " + cubo1.Area());
        System.out.println("Perímetro del cubo 1: " + cubo1.Perimetro());  

}}