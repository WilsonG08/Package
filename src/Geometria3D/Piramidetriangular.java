package Geometria3D;

public class Piramidetriangular {
    private double lado, alturabase, alturaCaraLateral;

    public Piramidetriangular() {
        this.lado = lado;
        this.alturabase = alturabase;
        this.alturaCaraLateral = alturaCaraLateral;
    }

    public double areaBase(){
        return (lado * alturabase)/2;
    }

    public double areaCaraLateral(){
        return (lado * alturaCaraLateral)/2;
    }

    public double areaTotal(){
        return (areaBase()+areaCaraLateral());
    }


    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setAlturabase(double alturabase) {
        this.alturabase = alturabase;
    }

    public void setAlturaCaraLateral(double alturaCaraLateral) {
        this.alturaCaraLateral = alturaCaraLateral;
    }
}
