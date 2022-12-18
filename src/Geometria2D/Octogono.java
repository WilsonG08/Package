package Geometria2D;

public class Octogono {

    double ladoOcto, apoOcto, angulo;

    public Octogono() {
        this.ladoOcto = ladoOcto;
        this.apoOcto = apoOcto;
        this.angulo = 22.5;
    }

    public double perimetroOctogono(){
        return ladoOcto*8;
    }

    public double areaOctogono(){
        return ((ladoOcto*8)*apoOcto)/2;
    }

    public double apotemaOctogono(){
        double an=0,mitadLado=0;
        an = Math.toRadians(angulo);
        mitadLado = ladoOcto/2;
        return (mitadLado/Math.tan(an));
    }

    public void setLadoOcto(double ladoOcto) {
        this.ladoOcto = ladoOcto;
    }

    public void setApoOcto(double apoOcto) {
        this.apoOcto = apoOcto;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
}
