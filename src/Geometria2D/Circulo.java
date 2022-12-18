package Geometria2D;

import java.util.Scanner;

public class Circulo {

    Scanner sc= new Scanner(System.in);
    double radioCirculo, diaCirculo, peCirculo;
    private double VPi = Math.PI;

    public Circulo(){
        radioCirculo = 0;
        diaCirculo = 0;
        peCirculo = 0;
    }

    public double areaCirculo() {
        return VPi*Math.pow(radioCirculo,2);
    }

    public double diametroCircuo(){
        diaCirculo = radioCirculo*2;
        return diaCirculo;
    }

    public double perimetroCirculo(){
        peCirculo = VPi * diaCirculo;
        return peCirculo;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public double getRadioCirculo() {
        return radioCirculo;
    }

    public void setRadioCirculo(double radioCirculo) {
        this.radioCirculo = radioCirculo;
    }

    public double getDiaCirculo() {
        return diaCirculo;
    }

    public void setDiaCirculo(double diaCirculo) {
        this.diaCirculo = diaCirculo;
    }

    public double getPeCirculo() {
        return peCirculo;
    }

    public void setPeCirculo(double peCirculo) {
        this.peCirculo = peCirculo;
    }
}
