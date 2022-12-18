import Geometria2D.*;
import Geometria3D.*;

import java.text.DecimalFormat;
import java.time.chrono.ThaiBuddhistEra;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dcm = new DecimalFormat("0.00");
        int op;
        Circulo circu = new Circulo();
        Cuadrado cua = new Cuadrado();
        Hexagono hexa =  new Hexagono();
        Paralelogramo para = new Paralelogramo();
        Pentagono pentaa = new Pentagono();
        Rectangulo rectan = new Rectangulo();
        Rombo rom = new Rombo();
        Trapecio trap = new Trapecio();
        Triangulo triangu = new Triangulo();
        Octogono octo = new Octogono();



        // Llamada de la funcion menu
        menu menu = new menu();

        // las clases de la geometria 3D

        double auxR=0;

        // Para la utilizacion de la clase geometria 2D
        double auxRDD=0,auxRDD2=0;

        Cilindro cilin = new Cilindro();
        Cono cono = new Cono();
        Cubo cubo = new Cubo();
        Esfera esf = new Esfera();
        PiramedeCuadrangular cuadra = new PiramedeCuadrangular();
        PiramideRectangular recta = new PiramideRectangular();
        Piramidetriangular tri = new Piramidetriangular();
        PrismaPentagonal pen = new PrismaPentagonal();
        PrismaRectangular rec = new PrismaRectangular();
        PrismaTriangular trian = new PrismaTriangular();

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
                                    circu.setRadioCirculo(auxRDD = sc.nextDouble());
                                }while (auxRDD < 0);
                                System.out.println("\nArea Circulo: " + dcm.format(circu.areaCirculo())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t\n ==[ Diámetro de un círculo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el radio del círculo: ");
                                    circu.setDiaCirculo(auxRDD = sc.nextDouble());
                                }while (auxRDD < 0);
                                System.out.println("\nEl diámetro del círculo es : "+dcm.format(circu.diametroCircuo())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t\n ==[ Perímetro de un círculo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el diámetro del círculo : ");
                                    circu.setPeCirculo(auxRDD = sc.nextDouble());
                                }while ( auxRDD < 0);
                                System.out.println("\nEl Perímetro del círculo es : "+dcm.format(circu.perimetroCirculo())+"\n");
                                System.out.println("==========================================================");
                                break;
                            case 2:
                                System.out.println("\t ==[ Área de un cuadrado ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese la longitud de un lado: ");
                                    cua.setaCuadrado(auxRDD = sc.nextDouble());
                                }while (auxRDD < 0);
                                System.out.println("\nEl área del cuadrado es : "+dcm.format(cua.areaCuadrado())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Perímetro de un cuadrado ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el lado del cuadrado : ");
                                    cua.setPeCuadrado( auxRDD = sc.nextDouble());
                                }while (auxRDD < 0);
                                System.out.println("EL Perímetro del cuadrado es : "+dcm.format(cua.perimetroCuadrado())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Diagonal de un cuadrado ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el lado del cuadrado : ");
                                    cua.setDiaCuadrado(auxRDD = sc.nextDouble());
                                }while (auxRDD < 0);
                                System.out.println("La diagonal del cuadrado es : "+dcm.format(cua.diagonalCuadrado())+"\n");
                                break;

                            case 3:
                                System.out.println("\t ==[ Área de un Hexagono ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el perímetro del hexagono : ");
                                    hexa.setPerimetro(auxRDD = sc.nextDouble());
                                }while(auxRDD < 0);
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el apotema : ");
                                    hexa.setApotema(auxRDD2 = sc.nextDouble());
                                }while (auxRDD2 < 0);
                                System.out.println("El área del hexagono es : "+dcm.format(hexa.areaHexagono())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Perímetro de un Hexagono ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor del lado : ");
                                    hexa.setLado(auxRDD = sc.nextDouble());
                                }while (auxRDD < 0);
                                System.out.println("El perímetro del hexagono es : "+dcm.format(hexa.perimetroHexagono())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Apotema de un Hexagono ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor del lado : ");
                                    hexa.setLado2(auxRDD = sc.nextDouble());
                                }while (auxRDD < 0);
                                System.out.println("El apotema del hexagono es : "+dcm.format(hexa.apotemaHexagono())+"\n");
                                break;

                            case 4:
                                System.out.println("\t ==[ Área de un Paralelogramo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese la altura :");
                                    para.setAltura(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese la base : ");
                                    para.setBase(auxRDD2 = sc.nextDouble());
                                }while (auxRDD < 0 || auxRDD2 < 0);
                                System.out.println("El área del paralelogramo es : "+dcm.format(para.areaParalelogramo())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Perímetro de un Paralelogramo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor del 1er lado :");
                                    para.setLado1(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese el valir del 2do lado : ");
                                    para.setLado2(auxRDD2 = sc.nextDouble());
                                }while (auxRDD <0 || auxRDD2 < 0);
                                System.out.println("El perímetro del paralelogramo es : "+dcm.format(para.periParalelogramo())+"\n");

                                System.out.println("==========================================================");
                                System.out.println("\t ==[ Altura de un Paralelogramo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor del lado vertical : ");
                                    para.setAltura2(auxRDD = sc.nextDouble());
                                    System.out.println("\nRecuerda que el ángulo no puede ser mayor a 60\n");
                                    System.out.print("Ingrese el valor del angulo : ");
                                    para.setAngulo(auxRDD2 = sc.nextDouble());
                                }while (auxRDD < 0||auxRDD>60);
                                System.out.println("Altura del paralelogramo : "+dcm.format(para.alturaParalelogramo())+"\n");
                                break;

                            case 5:
                                System.out.println("\t ==[ Perímetro de un Pentágono ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor de un lado : ");
                                    pentaa.setLadoPenta(auxRDD = sc.nextDouble());
                                }while (auxRDD < 0);
                                System.out.println("El perímetro del Pentágono es : "+dcm.format(pentaa.perimetroPentagono())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Área de un Pentágono ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese le valor de un lado : ");
                                    pentaa.setPerimetroPenta( auxRDD  =sc.nextDouble());
                                    System.out.print("Ingrese el apotema : ");
                                    pentaa.setApoPenta( auxRDD2 = sc.nextDouble());
                                }while (auxRDD < 0 || auxRDD2 <0);
                                System.out.println("El área del Pentágono es : "+dcm.format(pentaa.areaPentagono())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Apotema de un Pentágono ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor de un lado : ");
                                    pentaa.setMitadLado(auxRDD = sc.nextDouble());
                                }while (auxRDD < 0 );
                                System.out.println("El apotema de un Pentágono es : "+dcm.format(pentaa.apotemaPentagono())+"\n");
                                break;

                            case 6:

                                System.out.println("\t ==[ Área de un Rectángulo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor de la base : ");
                                    rectan.setBaseRec( auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese el valor de la altura : ");
                                    rectan.setAlturaRec(auxRDD2 = sc.nextDouble());
                                }while (auxRDD < 0 || auxRDD2 < 0);
                                System.out.println("El áre del Rectángulo es : "+dcm.format(rectan.areaRectangulo())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Altura del Rectángulo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor del área : ");
                                    rectan.setAreaRec(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese el valor de la base : ");
                                    rectan.setBaseRec(auxRDD2  =sc.nextDouble());
                                }while (auxRDD <0 || auxRDD2 <0);
                                System.out.println("La altura del Rectángulo es : "+dcm.format(rectan.alturaRectangulo())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Perímetro del Rectángulo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor del lado 1 : ");
                                    rectan.setLado1(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese el valor del lado 2 : ");
                                    rectan.setLado2(auxRDD2 = sc.nextDouble());
                                }while (auxRDD <0 || auxRDD2<0);
                                System.out.println("El perímetro del Rectángulo es : "+dcm.format(rectan.perimetroRectangulo()));
                                break;

                            case 7:
                                System.out.println("\t ==[ Perímetro del Rombo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor de un lado : ");
                                    rom.setLadoRom(auxRDD = sc.nextDouble());
                                }while (auxRDD < 0);
                                System.out.println("El Perímetro del Rombo es : "+dcm.format(rom.perimetroRombo())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Área del Rombo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.println("Recuerda que la diagonal mayor no puede ser mas grande que la diagonal menor!!");
                                    System.out.print("Ingrese la diagonal MAYOR : ");
                                    rom.setDiagonalMayorR(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese la diagonal MENOR : ");
                                    rom.setDiagonalMenorR(auxRDD2 = sc.nextDouble());
                                }while (auxRDD2 > auxRDD || auxRDD <0 || auxRDD2 <0);
                                System.out.println("El área del Rombo es : "+dcm.format(rom.areaRombo())+"\n");

                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Perímetro del Rombo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.println("Recuerda que la diagonal mayor no puede ser mas grande que la diagonal menor!!");
                                    System.out.print("Ingrese la diagonal MAYOR : ");
                                    rom.setDiagonalMayorR(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese la diagonal MENOR : ");
                                    rom.setDiagonalMenorR(auxRDD2 = sc.nextDouble());
                                }while (auxRDD2 > auxRDD || auxRDD <0 || auxRDD2 <0);
                                System.out.println("El lado el rombo es : "+dcm.format(rom.ladoRombo())+"\n");
                                break;

                            case 8:
                                System.out.println("\t ==[ Área del Trapecio Isoceles ]==\n");
                                double auxDD3=0;
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.println("Recuerda que la diagonal mayor no puede ser mas grande que la diagonal menor!!");
                                    System.out.print("Ingrese la diagonal MAYOR : ");
                                    trap.setBaseMAyor(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese la diagonal MENOR : ");
                                    trap.setBaseMenor(auxRDD2 = sc.nextDouble());
                                    System.out.print("Ingrese la altura : ");
                                    trap.setAltura(auxDD3 = sc.nextDouble());
                                }while (auxRDD2 > auxRDD || auxRDD <0 || auxRDD2 <0 || auxDD3 <0);
                                System.out.println("El área del Trapecio Iscoceles es : "+dcm.format(trap.areaTrapecioIsoceles())+"\n");

                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Perimetro de un Trapecio ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.println("Recuerda que la diagonal mayor no puede ser mas grande que la diagonal menor!!");
                                    System.out.print("Ingrese la diagonal MAYOR : ");
                                    trap.setBaseMAyor(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese la diagonal MENOR : ");
                                    trap.setBaseMenor(auxRDD2 = sc.nextDouble());
                                    System.out.print("Ingrese la altura : ");
                                    trap.setAltura(auxDD3 = sc.nextDouble());
                                }while (auxRDD2 > auxRDD || auxRDD <0 || auxRDD2 <0 || auxDD3 <0);
                                System.out.println("El perímetro del Trapecio es : "+dcm.format(trap.perimetroTrapecio()));

                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Altura de un Trapecio Isoceles ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.println("Recuerda que la diagonal mayor no puede ser mas grande que la diagonal menor!!");
                                    System.out.print("Ingrese la diagonal MAYOR : ");
                                    trap.setBaseMAyor(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese la diagonal MENOR : ");
                                    trap.setBaseMenor(auxRDD2 = sc.nextDouble());
                                    System.out.print("Ingrese la longitud del lado : ");
                                    trap.setLongLateral(auxDD3  = sc.nextDouble());
                                }while (auxRDD2 > auxRDD || auxRDD <0 || auxRDD2 <0 || auxDD3 <0);
                                System.out.println("La altura del Trapcio Isoceles es : "+dcm.format(trap.alturaTrapecioIsoceles())+"\n");
                                break;

                            case 9:
                                System.out.println("\t ==[ Perímetro del Triángulo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el 1er lado : ");
                                    triangu.setLado1(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese el 2do lado : ");
                                    triangu.setLado2(auxRDD2 = sc.nextDouble());
                                    System.out.print("Ingrese el 3er lado : ");
                                    triangu.setLado3(auxDD3 = sc.nextDouble());
                                }while (auxRDD <0 || auxRDD2 <0 || auxDD3 <0);
                                System.out.println("El perímetro del Triángulo es : "+dcm.format(triangu.perimetroTriangulo())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Área del Triángulo ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese la base : ");
                                    triangu.setBase(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese la altura : ");
                                    triangu.setAltura(auxRDD2 = sc.nextDouble());
                                }while (auxRDD<0 || auxRDD2<0);
                                System.out.println("El área del Triángulo es : "+dcm.format(triangu.areaTrianngulo())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Altura del Triángulo Equilatero ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor del lado : ");
                                    triangu.setLado1(auxRDD = sc.nextDouble());
                                }while (auxRDD<0);
                                System.out.println("La altural del Triángulo Equilatero es : "+dcm.format(triangu.alturaTrianguloEquilatero())+"\n");
                                break;

                            case 10:
                                System.out.println("\t ==[ Perímetro de un Octógono ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor del lado : ");
                                    octo.setLadoOcto(auxRDD = sc.nextDouble());
                                }while (auxRDD <0);
                                System.out.println("El Perímetro del Octógono es : "+dcm.format(octo.perimetroOctogono())+"\n");
                                System.out.println("==========================================================");

                                System.out.println("\t ==[ Área de un Octógono ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor del lado : ");
                                    octo.setLadoOcto(auxRDD = sc.nextDouble());
                                    System.out.print("Ingrese el apotema : ");
                                    octo.setApoOcto(auxRDD2 = sc.nextDouble());
                                }while (auxRDD<0 || auxRDD2<0);
                                System.out.printf("El área del Octógono es : "+dcm.format(octo.areaOctogono())+"\n");

                                System.out.println("==========================================================");

                                System.out.println("\t ==[  Apotema de un Octógono Regular ]==\n");
                                do{
                                    System.out.println("\n¡Ingrese valores positivos!\n");
                                    System.out.print("Ingrese el valor del lado : ");
                                    octo.setLadoOcto(auxRDD = sc.nextDouble());
                                }while (auxRDD<0);
                                System.out.println("El apotema del Octógono Regular es : "+dcm.format(octo.apotemaOctogono())+"\n");
                                break;
                        }
                    }while (op != 0);
                    break;
                case 2:
                    do {
                        auxR = 0;
                        op = 0;
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

                                System.out.println("\nArea Base Inferior: " + dcm.format(cilin.areaBaseInferior()) + "\n");

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
                                System.out.println("\nVolumen: " + dcm.format(cilin.volumenCilindro()) + "\n");

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

                                System.out.println("\nArea latertal: " + dcm.format(cono.arealateral()) + "\n");


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

                                System.out.println("\nArea total " + dcm.format(cono.areaTotal()) + "\n");

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

                                System.out.println("\nArea total " + dcm.format(cono.volumen()) + "\n");

                                break;

                            case 3:
                                System.out.println("\n===[ AREA DEL CUBO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    cubo.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea: " + dcm.format(cubo.area()) + "\n");

                                System.out.println("\n===[ VOLUMEN DEL CUBO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    cubo.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nVolumen: " + dcm.format(cubo.volumen()) + "\n");

                                System.out.println("\n===[ DIAGONAL DEL CUBO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    cubo.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nDiagonal: " + dcm.format(cubo.diagonal()) + "\n");
                                break;

                            case 4:
                                    System.out.println("\n===[ AREA DE LA ESFERA ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    esf.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea: " + dcm.format(esf.area()) + "\n");

                                System.out.println("\n===[ VOLUMEN DE LA ESFERA ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del radio: ");
                                    esf.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(esf.volumen()) + "\n");

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
                                System.out.println("\nArea: " + dcm.format(esf.area()) + "\n");
                                break;
                            case 5:
                                System.out.println("\n===[ AREA BASES PIRAMEDE CUADRANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    cuadra.setBase(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea base: " + dcm.format(cuadra.areaBae()) + "\n");

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
                                System.out.println("\nArea cara laterales: " + dcm.format(cuadra.areaCarasLaterales()) + "\n");

                                System.out.println("\n===[ VOLUMEN PIRAMEDE CUADRANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    cuadra.setBase(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(cuadra.volumen()) + "\n");
                                break;
                            case 6:
                                double menor=0;
                                System.out.println("\n===[ AREA DE LA PIRAMIDE RECTANGULAR]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("El lado menor no puede ser mayor que el otro lado");
                                    System.out.print("Ingrese el valor del lado mayor: ");
                                    recta.setBaseMayor(auxR = sc.nextDouble());
                                    System.out.print("Ingrese el valor del lado menor: ");
                                    recta.setBaseMenor(menor = sc.nextDouble());
                                }while ((auxR < 0)||(menor < 0) || (auxR <= menor));
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    recta.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea: " + dcm.format(recta.area()) + "\n");

                                System.out.println("\n===[ VOLUMEN DE LA PIRAMIDE RECTANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("El lado menor no puede ser mayor que el otro lado");
                                    System.out.print("Ingrese el valor del lado mayor: ");
                                    recta.setBaseMayor(auxR = sc.nextDouble());
                                    System.out.print("Ingrese el valor del lado menor: ");
                                    recta.setBaseMenor(menor = sc.nextDouble());
                                }while ((auxR < 0)||(menor < 0) || (auxR <= menor));
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    recta.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(recta.volumen()) + "\n");
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
                                System.out.println("\nArea base: " + dcm.format(tri.areaBase()) + "\n");

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
                                System.out.println("\nArea cara lateral: " + dcm.format(tri.areaCaraLateral()) + "\n");

                                System.out.println("\n===[ AREA CARA LATERAL DE LA PIRAMEDE TRIANGULAR ]===");
                                System.out.println("\nArea total: " + dcm.format(tri.areaTotal() + "\n"));
                                break;
                            case 8:
                                System.out.println("\n===[ AREA PRISMA PENTAGONAL ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    pen.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del apotema: ");
                                    pen.setApotema(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    pen.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea: " + dcm.format(pen.area()) + "\n");

                                System.out.println("\n===[ AREA BASES DEL PRISMA PENTAGONAL ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    pen.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del apotema: ");
                                    pen.setApotema(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea base: " + dcm.format(pen.areaBase()) + "\n");

                                System.out.println("\n===[ VOLUMEN DEL PRISMA PENTAGONAL ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    pen.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del apotema: ");
                                    pen.setApotema(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(pen.volumen()) + "\n");
                                break;

                            case 9:
                                double menor1=0;
                                System.out.println("\n===[ AREA DE LA PRISMA RECTANGULAR]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("El lado menor no puede ser mayor que el otro lado");
                                    System.out.print("Ingrese el valor del lado mayor: ");
                                    rec.setBaseMayor(auxR = sc.nextDouble());
                                    System.out.print("Ingrese el valor del lado menor: ");
                                    rec.setBaseMenor(menor1 = sc.nextDouble());
                                }while ((auxR < 0)||(menor1 < 0) || (auxR <= menor1));
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    rec.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea: " + dcm.format(rec.area()) + "\n");

                                System.out.println("\n===[ AREA LATERAL DE LA PRISMA RECTANGULAR]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("El lado menor no puede ser mayor que el otro lado");
                                    System.out.print("Ingrese el valor del lado mayor: ");
                                    rec.setBaseMayor(auxR = sc.nextDouble());
                                    System.out.print("Ingrese el valor del lado menor: ");
                                    rec.setBaseMenor(menor1 = sc.nextDouble());
                                }while ((auxR < 0)||(menor1 < 0) || (auxR <= menor1));
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    rec.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea lateral: " + dcm.format(rec.areaLateral()) + "\n");

                                System.out.println("\n===[ VOLUMEN DE LA PRISMA RECTANGULAR]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("El lado menor no puede ser mayor que el otro lado");
                                    System.out.print("Ingrese el valor del lado mayor: ");
                                    rec.setBaseMayor(auxR = sc.nextDouble());
                                    System.out.print("Ingrese el valor del lado menor: ");
                                    rec.setBaseMenor(menor1 = sc.nextDouble());
                                }while ((auxR < 0)||(menor1 < 0) || (auxR <= menor1));
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    rec.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(rec.volumen()) + "\n");

                                break;

                            case 10:
                                int aux;
                                System.out.println("\n===[ ARISTAS DEL PRISMA TRIANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el numero de caras: ");
                                    trian.setCaras(aux = sc.nextInt());
                                }while (aux < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el numero de vertices: ");
                                    trian.setVertices(aux = sc.nextInt());
                                }while (aux < 0);

                                System.out.println("\nAristas: " + dcm.format(trian.aristas()) + "\n");

                                System.out.println("\n===[ AREA DEL PRISMA TRIANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    trian.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    trian.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nArea: " + dcm.format(trian.area()) + "\n");

                                System.out.println("\n===[ VOLUMEN DEL PRISMA TRIANGULAR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor del lado: ");
                                    trian.setLado(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    trian.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(trian.volumen()) + "\n");
                                break;


                        }
                    }while (op != 0);
                    break;
            }
        }while(op != 0);
    }
}
