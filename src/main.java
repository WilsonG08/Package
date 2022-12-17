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
                                    System.out.println("Ingre el valor del radio: ");
                                    cilin.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese el valor de la altura: ");
                                    cilin.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nLa area del cilindro es:" + dcm.format(cilin.areaCilindro()));


                                System.out.println("\n===[ AREA BASE INFERIOR ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("Ingre el valor del radio: ");
                                    cilin.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea Base Inferior: " + dcm.format(cilin.areaBaseInferior() + "\n"));

                                System.out.println("\n===[ VOLUMEN ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("Ingre el valor del radio: ");
                                    cilin.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("Ingrese el valor de la altura: ");
                                    cilin.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                System.out.println("\nVolumen: " + dcm.format(cilin.volumenCilindro() + "\n"));

                                break;

                            case 2:
                                System.out.println("\n===[ AREA LATERAL DEL CONO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("Ingre el valor del radio: ");
                                    cono.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("Ingre el valor de la inclinacion: ");
                                    cono.setInclinacion(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea latertal: " + dcm.format(cono.arealateral() + "\n"));


                                System.out.println("\n===[ AREA TOTAL DEL CONO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("Ingre el valor del radio: ");
                                    cono.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("Ingre el valor de la inclinacion: ");
                                    cono.setInclinacion(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea total " + dcm.format(cono.areaTotal() + "\n"));

                                System.out.println("\n===[ VOLUMEN DEL CONO ]===");
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("Ingre el valor del radio: ");
                                    cono.setRadio(auxR = sc.nextDouble());
                                }while (auxR < 0);
                                do {
                                    System.out.println("Ingrese valores positivoso \n");
                                    System.out.println("Ingre el valor de la altura: ");
                                    cono.setAltura(auxR = sc.nextDouble());
                                }while (auxR < 0);

                                System.out.println("\nArea total " + dcm.format(cono.volumen() + "\n"));

                                break;





                        }
                    }while (op != 0);
                    break;
            }
        }while(op != 0);
    }
}
