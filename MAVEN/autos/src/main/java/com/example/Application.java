package com.example;

public class Application {

    public static void main(String[] args) {




        Auto uno = new Auto("audi", "a4", 2000);

        imprime(uno);

      

        


    }

    public static void imprime(Auto uno) {
    System.out.println("La marca es " + uno.marca);
    System.out.println("El modelo es " + uno.modelo);
    System.out.println("El año es " + uno.año);
}

    
    
}
