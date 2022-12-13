import Geometria2D.*;

public class main {

    public static void main(String[] args) {
        int op;
        Circulo cir = new Circulo();
        menu menu = new menu();
        double auxR;


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
                                    System.out.println("Area Circulo: " + cir.areaCirculo());
                                }while (op < 0);
                                break;
                        }
                    }while (op != 0);
                    break;
            }
        }while(op != 0);
    }
}
