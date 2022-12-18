package Geometria2D;

public class Hexagono {

    double arHexagono, peHexagono, apoHexagono;
    double p,peri, apo;

    public Hexagono(){
        arHexagono = 0;
        peHexagono =0;
        apoHexagono =0;
        p=0;peri=0;apo=0;
    }

    public double areaHexagono(){
        peri = p * 6;
        arHexagono = ((peri *apo)/2);
        return  peri;
    }
}
