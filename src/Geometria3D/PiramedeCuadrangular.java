package Geometria3D;

public class PiramedeCuadrangular {

    private double base, altura;

    public PiramedeCuadrangular() {
        this.base = base;
        this.altura = altura;
    }

    public double areaBae () {
        return Math.pow(base,2);
    }

    public double areaCarasLaterales(){
        return (base*altura)/2;
    }

    public double volumen (){
        return (areaBae() * altura)/3;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
