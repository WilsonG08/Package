package Geometria2D;

public class Paralelogramo {
    double base, altura, lado1, lado2, altura2, angulo;

    public Paralelogramo() {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura2 = altura2;
        this.angulo = angulo;
    }

    public double alturaParalelogramo(){
        double a = Math.toRadians(angulo);
        return (altura2)*Math.sin(a);
    }

    public double periParalelogramo(){
        return (lado1+lado2)*2;
    }

    public double areaParalelogramo(){
        return base*altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setAltura2(double altura2) {
        this.altura2 = altura2;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
}
