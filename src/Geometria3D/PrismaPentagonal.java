package Geometria3D;

public class PrismaPentagonal {

    private double lado, apotema, altura;

    public PrismaPentagonal() {
        this.lado = lado;
        this.apotema = apotema;
        this.altura = altura;
    }

    public double area(){
        return 5 * lado * (apotema+altura);
    }

    public double areaBase(){
        return (5*lado*apotema)/2;
    }

    public double volumen(){
        return (areaBase() * altura);
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
