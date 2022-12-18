package Geometria2D;

public class Triangulo {
    double lado1,lado2,lado3, altura, base;

    public Triangulo() {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
        this.base = base;
    }

    public double perimetroTriangulo(){
        return lado1+lado2+lado3;
    }

    public double areaTrianngulo(){
        return (base*altura)/2;
    }

    public double alturaTrianguloEquilatero(){
        double lado;
        lado = lado1/2;
        return Math.sqrt(Math.pow(lado1,2)-Math.pow(lado,2));
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
