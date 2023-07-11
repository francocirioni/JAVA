package com.franco;




public class Cubo {
    public double altocubo;
    public double anchocubo;

    public Cubo(double alto, double ancho) {
        this.altocubo = alto;
        this.anchocubo = ancho;
    }

    public double Area() {
        double area = altocubo * anchocubo;
        return area;
    }

    public double Perimetro() {
        double per = altocubo * 4;
        return per;
    }
}



