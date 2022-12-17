package Geometria3D;

public class PiramideRectangular {
    private double baseMayor, baseMenor, altura;

    public PiramideRectangular() {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double area(){
        return baseMenor * baseMayor + baseMenor * Math.sqrt(Math.pow(altura,2) + (Math.pow(baseMayor,2))/4 ) +
        baseMayor * Math.sqrt(Math.pow(altura,2) + (Math.pow(baseMenor,2))/4);
    }

    public double volumen(){
        return (baseMenor * baseMayor * altura)/3;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
