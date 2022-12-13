package Geometria2D;

import java.util.Scanner;

public class Circulo {

    Scanner sc= new Scanner(System.in);
    private double radioCirculo,diametroCirculo,perimetroCirculo;

    public Circulo() {

        this.radioCirculo = radioCirculo;
        this.diametroCirculo = diametroCirculo;
        this.perimetroCirculo = perimetroCirculo;
    }

    public void areaCirculo() {
        System.out.println("\t ==[ Área de un círculo ]==\n");

        do{
            System.out.println("\n¡Ingrese valores positivos!\n");
            System.out.print("Ingrese el radio del círculo: ");
            setRadioCirculo(radioCirculo = sc.nextDouble());
        }while (radioCirculo < 0);
        System.out.println("EL area es :"+Math.PI*Math.pow(radioCirculo,2));
    }

    public void diametroCircuo(){
        System.out.println("\n\t==[ Diámetro de un círculo ]==\n");
        System.out.println("EL radio es:"+radioCirculo);
        System.out.println("El diametro es: "+radioCirculo*2);

    }





    public void setRadioCirculo(double radioCirculo) {
        this.radioCirculo = radioCirculo;
    }

    public void setDiametroCirculo(double diametroCirculo) {
        this.diametroCirculo = diametroCirculo;
    }

    public void setPerimetroCirculo(double perimetroCirculo) {
        this.perimetroCirculo = perimetroCirculo;
    }
}
