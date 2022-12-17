package Geometria3D;

public class Esfera {
    private double NPi = Math.PI;

    private double radio, altura;

    public Esfera() {
        this.radio = radio;
        this.altura = altura;
    }

    public double area(){
        return 4*NPi*Math.pow(radio,2);
    }
    public double volumen(){
        return (4*NPi*Math.pow(radio,3))/3;
    }

    public double VolumenSector (){
        return (2*NPi*(Math.pow(radio,2)*altura))/3;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
