package Geometria3D;

import java.util.Map;
import java.util.Scanner;

public class Cilindro {
    double areaCilin, areaBI, volumenCilin;
    double altura, radio;
    private double NPi = Math.PI;
    Scanner sc = new Scanner(System.in);
    public Cilindro() {
        this.areaCilin = areaCilin;
        this.areaBI = areaBI;
        this.volumenCilin = volumenCilin;
        this.altura = altura;
        this.NPi = NPi;
        this.radio = radio;
    }
    public void areaCilindro(){
        do {
            System.out.println("Ingre el valor del radio: ");
            setRadio(radio = sc.nextDouble());
        }while (radio < 0);
        do {
            System.out.println("Ingrese el valor de la altura: ");
            setAltura(altura = sc.nextDouble());
        }while (altura < 0);
        areaCilin = 2 * NPi * radio * (radio + altura);
        System.out.println("La area del cilindro es:" + areaCilin);
    }

    public void areaBaseInferior (){
        do {
            System.out.println("Ingrese valores positivoso \n");
            System.out.println("Ingre el valor del radio: ");
            setRadio(radio = sc.nextDouble());
        }while (radio < 0);
        areaBI = NPi * Math.pow(radio,2);
        System.out.println("Area Base Inferior: " + areaBI);
    }

    public void volumenCilindro () {
        do {
            System.out.println("Ingrese valores positivoso \n");
            System.out.println("Ingre el valor del radio: ");
            setRadio(radio = sc.nextDouble());
        }while (radio < 0);
        do {
            System.out.println("Ingrese valores positivoso \n");
            System.out.println("Ingrese el valor de la altura: ");
            setAltura(altura = sc.nextDouble());
        }while (altura < 0);
        volumenCilin = NPi * Math.pow(radio,2);
    }
    public void setAreaCilin(double areaCilin) {
        this.areaCilin = areaCilin;
    }

    public void setAreaBI(double areaBI) {
        this.areaBI = areaBI;
    }

    public void setVolumenCilin(double volumenCilin) {
        this.volumenCilin = volumenCilin;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


}
