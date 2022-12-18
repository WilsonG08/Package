package Geometria2D;

public class Trapecio {
    double baseMenor, baseMAyor, altura;

    public Trapecio() {
        this.baseMenor = baseMenor;
        this.baseMAyor = baseMAyor;
        this.altura = altura;
    }

    public double areaTrapecioIsoceles(){
        return (((baseMAyor*baseMenor)*altura)/2);
    }

    public double perimetroTrapecio(){
        double  bMe=0, bMa=0,resul=0,base=0;
        resul = bMa-bMe;
        base = resul/2;
        return Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setBaseMAyor(double baseMAyor) {
        this.baseMAyor = baseMAyor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
