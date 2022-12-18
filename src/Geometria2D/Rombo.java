package Geometria2D;

public class Rombo {
    double ladoRom, diagonalMayorR, diagonalMenorR;

    public Rombo() {
        this.ladoRom = ladoRom;
        this.diagonalMayorR = diagonalMayorR;
        this.diagonalMenorR = diagonalMenorR;
    }

    public double perimetroRombo(){
        return ladoRom * 4;
    }

    public double areaRombo(){
        return (diagonalMayorR*diagonalMenorR)/2;
    }

    public double ladoRombo(){
        double dM,dME;
        dM=diagonalMayorR/2;
        dME=diagonalMenorR/2;
        return (Math.sqrt(Math.pow((dM),2)+Math.pow((dME),2)));
    }

    public void setLadoRom(double ladoRom) {
        this.ladoRom = ladoRom;
    }

    public void setDiagonalMayorR(double diagonalMayorR) {
        this.diagonalMayorR = diagonalMayorR;
    }

    public void setDiagonalMenorR(double diagonalMenorR) {
        this.diagonalMenorR = diagonalMenorR;
    }
}
