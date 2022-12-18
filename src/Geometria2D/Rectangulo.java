package Geometria2D;

public class Rectangulo {
    double baseRec, alturaRec, areaRec, lado1, lado2;

    public Rectangulo() {
        this.baseRec = baseRec;
        this.alturaRec = alturaRec;
        this.areaRec = areaRec;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double areaRectangulo(){
        return baseRec*alturaRec;
    }

    public double alturaRectangulo(){
        return (areaRec)/(baseRec);
    }

    public double perimetroRectangulo(){
        return (lado1+lado2)*2;
    }

    public void setBaseRec(double baseRec) {
        this.baseRec = baseRec;
    }

    public void setAlturaRec(double alturaRec) {
        this.alturaRec = alturaRec;
    }

    public void setAreaRec(double areaRec) {
        this.areaRec = areaRec;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}
