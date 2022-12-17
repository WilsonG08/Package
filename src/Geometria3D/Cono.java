package Geometria3D;



public class Cono {

    private double NPi = Math.PI;
    private double radio, inclinacion, altura;

    public Cono() {
        this.NPi = NPi;
        this.radio = radio;
        this.inclinacion = inclinacion;
        this.altura = altura;
    }

    public double arealateral() {
        return NPi * radio * inclinacion;
    }

    public double areaTotal(){
        return (NPi * radio * inclinacion) + (NPi * (Math.pow(radio,2)));
    }
    public double volumen() {
        return (NPi * Math.pow(radio,2) * altura) / 3;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setInclinacion(double inclinacion) {
        this.inclinacion = inclinacion;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
