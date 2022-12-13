package Geometria2D;

import java.util.Scanner;

public class Circulo {

    Scanner sc= new Scanner(System.in);
    double radioCirculo;
    double diametroCirculo;
    double perimetroCirculo;

    public Circulo(){
        radioCirculo = 0;
        diametroCirculo = 0;
        perimetroCirculo = 0;
    }

    public double areaCirculo() {
        return Math.PI*Math.pow(radioCirculo,2);
    }

    public void diametroCircuo(){
        System.out.println("\n\t==[ Diámetro de un círculo ]==\n");
        System.out.println("EL radio es:"+radioCirculo);
        System.out.println("El diametro es: "+radioCirculo*2);

    }

    public double getRadioCirculo() {
        return radioCirculo;
    }

    public void setRadioCirculo(double radioCirculo) {
        this.radioCirculo = radioCirculo;
    }

    public double getDiametroCirculo() {
        return diametroCirculo;
    }

    public void setDiametroCirculo(double diametroCirculo) {
        this.diametroCirculo = diametroCirculo;
    }

    public double getPerimetroCirculo() {
        return perimetroCirculo;
    }

    public void setPerimetroCirculo(double perimetroCirculo) {
        this.perimetroCirculo = perimetroCirculo;
    }
}
