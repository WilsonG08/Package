import Geometria2D.*;
import Geometria3D.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dcm = new DecimalFormat("0.00");
        int op;
        Circulo cir = new Circulo();
        menu menu = new menu();

        // las clases de la geometria 3D

        double auxR=0;

        Cilindro cilin = new Cilindro();
        Cono cono = new Cono();
        Cubo cubo = new Cubo();
        Esfera esf = new Esfera();
        PiramedeCuadrangular cuadra = new PiramedeCuadrangular();
        PiramideRectangular recta = new PiramideRectangular();
        Piramidetriangular tri = new Piramidetriangular();

        do{
            op = menu.menu();
            switch (op) {
                case 1:
                    do {
                        op = menu.geometria2D();
                        switch (op){
                            case 1:
                                System.out.println("\t ==[ Área de un círculo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el radio del círculo: ");
                                    cir.setRadioCirculo(auxR = menu.sc.nextDouble());
                                    System.out.println("Area Circulo: " + dcm.format(cir.areaCirculo()));
                                }while (op < 0);
                                break;
                        }
                    }while (op != 0);
                    break;
                case 2:
                    do {
                        auxR = 0;
                        op = menu.geometria3D();
                        switch (op){
                            case 1:
                                System.out.println("\n===[ AREA DEL CILINDRO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    cilin.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    cilin.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nLa area del cilindro es:" + dcm.format(cilin.areaCilindro()));


                                System.out.println("\n===[ AREA BASE INFERIOR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    cilin.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea Base Inferior: " + dcm.format(cilin.areaBaseInferior() + "\n"));

                                System.out.println("\n===[ VOLUMEN ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    cilin.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    cilin.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(cilin.volumenCilindro() + "\n"));

                                break;

                            case 2:
                                System.out.println("\n===[ AREA LATERAL DEL CONO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    cono.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la inclinacion: ");
                                    cono.setInclinacion(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea latertal: " + dcm.format(cono.arealateral() + "\n"));


                                System.out.println("\n===[ AREA TOTAL DEL CONO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    cono.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la inclinacion: ");
                                    cono.setInclinacion(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea total " + dcm.format(cono.areaTotal() + "\n"));

                                System.out.println("\n===[ VOLUMEN DEL CONO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    cono.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    cono.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea total " + dcm.format(cono.volumen() + "\n"));

                                break;

                            case 3:
                                System.out.println("\n===[ AREA DEL CUBO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    cubo.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea: " + dcm.format(cubo.area() + "\n"));

                                System.out.println("\n===[ VOLUMEN DEL CUBO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    cubo.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nVolumen: " + dcm.format(cubo.volumen() + "\n"));

                                System.out.println("\n===[ DIAGONAL DEL CUBO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    cubo.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nDiagonal: " + dcm.format(cubo.diagonal() + "\n"));
                                break;

                            case 4:
                                    System.out.println("\n===[ AREA DE LA ESFERA ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    esf.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea: " + dcm.format(esf.area() + "\n"));

                                System.out.println("\n===[ VOLUMEN DE LA ESFERA ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    esf.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(esf.volumen() + "\n"));

                                System.out.println("\n===[ VOLUMEN DEL SECTOR ESFERICO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    esf.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    esf.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea: " + dcm.format(esf.area() + "\n"));
                                break;
                            case 5:
                                System.out.println("\n===[ AREA BASES PIRAMEDE CUADRANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    cuadra.setBase(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea base: " + dcm.format(cuadra.areaBae() + "\n"));

                                System.out.println("\n===[ AREA CARA LATERALES DE LA PIRAMEDE CUADRANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    cuadra.setBase(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    cuadra.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea cara laterales: " + dcm.format(cuadra.areaCarasLaterales() + "\n"));

                                System.out.println("\n===[ VOLUMEN PIRAMEDE CUADRANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    cuadra.setBase(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(cuadra.volumen() + "\n"));
                                break;
                            case 6:
                                double menor=0;
                                System.out.println("\n===[ AREA DE LA PIRAMIDE RECTANGULAR]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado mayor: ");
                                    recta.setBaseMayor(auxR = sc.nextDouble());
                                    System.out.print("Ingrese el valor del lado mayor: ");
                                    recta.setBaseMenor(menor = sc.nextDouble());
                                }while ((auxR < 0)||(menor < 0) || (auxR > menor));
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    recta.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea: " + dcm.format(recta.area() + "\n"));

                                System.out.println("\n===[ VOLUMEN DE LA PIRAMIDE RECTANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado mayor: ");
                                    recta.setBaseMayor(auxR = sc.nextDouble());
                                    System.out.print("Ingrese el valor del lado mayor: ");
                                    recta.setBaseMenor(menor = sc.nextDouble());
                                }while ((auxR < 0)||(menor < 0) || (auxR > menor));
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    recta.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(recta.volumen() + "\n"));
                                break;

                            case 7:
                                System.out.println("\n===[ AREA BASES DE LA PIRAMEDE TRIANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    tri.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura base: ");
                                    tri.setAlturabase(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea base: " + dcm.format(tri.areaBase() + "\n"));

                                System.out.println("\n===[ AREA CARA LATERAL DE LA PIRAMEDE TRIANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    tri.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura lateral: ");
                                    tri.setAlturaCaraLateral(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea cara lateral: " + dcm.format(tri.areaCaraLateral() + "\n"));

                                System.out.println("\n===[ AREA CARA LATERAL DE LA PIRAMEDE TRIANGULAR ]===");
                                System.out.println("\nArea total: " + dcm.format(tri.areaTotal() + "\n"));
                                break;



                        }
                    }while (op != 0);
                    break;
            }
        }while(op != 0);
    }
}
