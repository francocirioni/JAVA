package com.example.enums;

public enum Colores {

    ROJO("#FF0000"),VERDE("#FF0000"),AZUL("#FF0000");

    private String descripcion;

    private Colores (String descripcion){

        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

 



    
}
