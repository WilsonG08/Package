package Geometria2D;

public class Hexagono {

    double perimetro,apotema,lado,angulo,lado2;

    public Hexagono() {
        this.perimetro = perimetro;
        this.apotema = apotema;
        this.lado= lado;
        this.angulo=30;
        this.lado2=lado2;
    }

    public double areaHexagono(){
        return (((perimetro*6)*apotema)/2);
    }

    public double perimetroHexagono(){
        return (lado)*6;
    }

    public double apotemaHexagono(){
        return (lado2/1.15);
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
