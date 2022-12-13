import java.sql.SQLOutput;
import java.util.Scanner;

public class menu {
    Scanner sc = new Scanner(System.in);
    int menu(){
        int op;
        do {
            System.out.println("=====GEOMETRIA=====");
            System.out.println("| 1. Geometria 2D |");
            System.out.println("| 2. Geometria 3D |");
            System.out.println("| 0. Salir        |");
            System.out.println("===================");
            System.out.print("Opcion: ");
            op = sc.nextInt();
        }while (op < 0 || op > 2);
        return op;
    }

    int geometria2D () {
        int op;
        do {
            System.out.println("=====GEOMETRIA 2D=====");
            System.out.println("| 1. Circulo         |");
            System.out.println("| 2. Geometria 3D |");
            System.out.println("| 0. Salir        |");
            System.out.println("===================");
            System.out.print("Opcion: ");
            op = sc.nextInt();
        }while (op < 0 || op > 2);
        return op;
    }
}
