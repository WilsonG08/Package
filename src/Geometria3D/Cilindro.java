package Geometria3D;

import java.util.Map;

public class Cilindro {
    double areaCilin, areaBI, volumenCilin;
    double altura, radio;
    private double NPi = Math.PI;



    public Cilindro() {
        this.areaCilin = areaCilin;
        this.areaBI = areaBI;
        this.volumenCilin = volumenCilin;
        this.altura = altura;
        this.NPi = NPi;
        this.radio = radio;
    }
    public double areaCilindro(){
        areaCilin = 2 * NPi * radio * (radio + altura);
        return areaCilin;
    }

    public double areaBaseInferior (){
        areaBI = NPi * Math.pow(radio,2);
        return  areaBI;
    }

    public double volumenCilindro () {
        volumenCilin = NPi * Math.pow(radio,2);
        return volumenCilin;
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
