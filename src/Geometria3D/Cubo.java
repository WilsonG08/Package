package Geometria3D;

public class Cubo {
    private double lado;

    public Cubo() {
        this.lado = lado;
    }

    public double area (){
        return 6 *(lado)*(lado);
    }

    public double volumen(){
        return Math.pow(lado,3);
    }

    public double diagonal(){
        return lado * Math.sqrt(3);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
