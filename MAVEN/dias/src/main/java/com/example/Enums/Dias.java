package com.example.Enums;

public enum Dias {

    LUNES("Lunes","si"), MARTES("martes","si"),
    MIERCOLES("miercoles","si"), JUEVES("jueves","si"),
    VIERNES("viernes","si"), SABADO("sabado","si"),
    DOMINGO("domingo","si");

    private String descripcion;
    private String laboral;

    private Dias(String descripcion, String laboral) {
        this.descripcion = descripcion;
        this.laboral = laboral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLaboral() {
        return laboral;
    }



}
