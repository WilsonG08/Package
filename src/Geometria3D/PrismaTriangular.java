package Geometria3D;

public class PrismaTriangular {

    private int caras, vertices;
    private double lado, altura;

    public PrismaTriangular() {
        this.caras = caras;
        this.vertices = vertices;
        this.lado = lado;
        this.altura = altura;
    }

    public double aristas(){
        return caras + vertices - 2;
    }

    public double area(){
        return lado *(((Math.sqrt(3))/2) * lado + 3 * altura);
    }

    public double volumen(){
        return ((Math.sqrt(3)/4) * Math.pow(lado,2) * altura);
    }
    public void setCaras(int caras) {
        this.caras = caras;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
