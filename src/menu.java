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
            System.out.println("| 1. Círculo         |");
            System.out.println("| 2. Cuadrado        |");
            System.out.println("| 3. Elipse          |");
            System.out.println("| 4. Paralelogramo   |");
            System.out.println("| 5. Pentágono       |");
            System.out.println("| 6. Rectángulo      |");
            System.out.println("| 7. Rombo           |");
            System.out.println("| 8. Trapecio        |");
            System.out.println("| 9. Triángulo       |");
            System.out.println("| 10. Octógono       |");
            System.out.println("| 0. Salir        |");
            System.out.println("===================");
            System.out.print("Opcion: ");
            op = sc.nextInt();
        }while (op < 0 || op > 10);
        return op;
    }

    int geometria3D () {
        int op;
        do {
            System.out.println("=========GEOMETRIA 3D=========");
            System.out.println("| 1. Cilindro                |");
            System.out.println("| 2. Cono                    |");
            System.out.println("| 3. Cubo                    |");
            System.out.println("| 4. Esfera                  |");
            System.out.println("| 5. Pitamide Cuadrangulas   |");
            System.out.println("| 6. Piramide Rectangular    |");
            System.out.println("| 7. Piramide triangular     |");
            System.out.println("| 8. Prisma Pentagonal       |");
            System.out.println("| 9. Prisma Rectangular      |");
            System.out.println("| 10. Prisma Triangular      |");
            System.out.println("| 0. Salir                   |");
            System.out.println("==============================");
            System.out.print("Opcion: ");
            op = sc.nextInt();
        }while (op < 0 || op > 10);
        return op;
    }
}
