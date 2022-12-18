package Geometria2D;

public class Pentagono {

    double ladoPenta, perimetroPenta, apoPenta, angulo, mitadLado;

    public Pentagono() {
        this.ladoPenta = ladoPenta;
        this.perimetroPenta = perimetroPenta;
        this.apoPenta = apoPenta;
        this.angulo = 36;
        this.mitadLado = mitadLado;
    }

    public double perimetroPentagono(){
        return ladoPenta * 5;
    }

    public double areaPentagono(){
        return ((perimetroPenta) * apoPenta) / 2;
    }

    public double apotemaPentagono(){
        double a;
        a = Math.toRadians(angulo);
        return (mitadLado/2)/Math.tan(a);
    }

    public void setLadoPenta(double ladoPenta) {
        this.ladoPenta = ladoPenta;
    }

    public void setPerimetroPenta(double perimetroPenta) {
        this.perimetroPenta = perimetroPenta;
    }

    public void setApoPenta(double apoPenta) {
        this.apoPenta = apoPenta;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public void setMitadLado(double mitadLado) {
        this.mitadLado = mitadLado;
    }

}
