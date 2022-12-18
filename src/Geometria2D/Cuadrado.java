package Geometria2D;

import java.util.Scanner;

public class Cuadrado {

    Scanner sc = new Scanner(System.in);

    double  aCuadrado, peCuadrado, diaCuadrado;
    private int cuadrado = 4;

    public Cuadrado(){
        aCuadrado=0;
        peCuadrado=0;
        diaCuadrado=0;
    }

    public double areaCuadrado(){
        return Math.pow(aCuadrado,2);
    }

    public double perimetroCuadrado(){
        return cuadrado * peCuadrado;
    }

    public double diagonalCuadrado(){
        return diaCuadrado * Math.sqrt(2);
    }

    public Scanner getSc() {
        return sc;
    }

    public double getaCuadrado() {
        return aCuadrado;
    }

    public void setaCuadrado(double aCuadrado) {
        this.aCuadrado = aCuadrado;
    }

    public double getPeCuadrado() {
        return peCuadrado;
    }

    public void setPeCuadrado(double peCuadrado) {
        this.peCuadrado = peCuadrado;
    }

    public double getDiaCuadrado() {
        return diaCuadrado;
    }

    public void setDiaCuadrado(double diaCuadrado) {
        this.diaCuadrado = diaCuadrado;
    }
}
