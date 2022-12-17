package Geometria3D;

public class PrismaRectangular {
    private double baseMayor, baseMenor, altura;

    public PrismaRectangular() {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double area(){
        return 2*(baseMayor*baseMenor + baseMenor*altura + altura*baseMayor);
    }

    public double areaLateral (){
        return 2*(baseMenor+ baseMayor) * altura;
    }

    public double volumen(){
        return baseMayor * baseMenor * altura;
    }


    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
