import java.util.Scanner;

public class EjercicioVeintiseis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el numero de filas de tu primera matriz ");
        int filasUno = input.nextInt();
        System.out.println("Introduce el numero de columnas de tu primera matriz ");
        int columnasUno = input.nextInt();

        int[][] matrizUno = new int[filasUno][columnasUno];
        System.out.println("Introduce los numeros de la primera matriz");
        for (int i = 0; i < filasUno; i++) {
            for (int x = 0; x < columnasUno; x++) {
                matrizUno[i][x] = input.nextInt();
            }
        }

        System.out.println("Introduce el numero de filas de la segunda matriz ");
        int filasDos = input.nextInt();
        System.out.println("Introduce el numero de columnas de la segunda matriz ");
        int columnasDos = input.nextInt();

        if (columnasUno != filasDos) {
            System.out.println("Las matrices no son compatibles para multiplicarse");
            input.close();
            return;
        }

        int[][] matrizDos = new int[filasDos][columnasDos];
        System.out.println("Introduzca los numeros de la segunda matriz ");
        for (int i = 0; i < filasDos; i++) {
            for (int x = 0; x < columnasDos; x++) {
                matrizDos[i][x] = input.nextInt();
            }
        }
        int[][] matrizNueva = new int[filasUno][columnasDos];
        for (int i = 0; i < filasUno; i++) {
            for (int x = 0; x < columnasUno; x++) {
                matrizNueva[i][x] = 0;
                for (int f = 0; f < columnasUno; f++) {
                    matrizNueva[i][x] = matrizNueva[i][x] + (matrizUno[i][f] * matrizDos[f][x]);

                }
            }
        }
        System.out.println("Multiplicacion de las matrices ");
        for (int[] fila : matrizNueva) {
            for (int num : fila) {
                System.out.println(num + " ");

            }
            System.out.println();
        }
        input.close();
    }
}