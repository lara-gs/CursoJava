public class EjercicioVeintinueve {
    public static void main(String[] args) {

        int[][] matrizUno = {
                { 9, 8, 7 },
                { 7, 8, 9 },
                { 8, 5, 6 }
        };
        int[][] matrizDos = {
                { 3, 2, 1 },
                { 4, 5, 6 },
                { 1, 2, 3 }
        };
        int[][] matrizNueva = new int[3][3];
        for (int i = 0; i < matrizUno.length; i++) {
            for (int x = 0; x < matrizDos[i].length; x++) {
                matrizNueva[i][x] = matrizUno[i][x] + matrizDos[i][x];

            }
        }
        System.out.println("Suma de las matrices:");
        for (int[] fila : matrizNueva) {
            for (int num : fila) {
                System.out.println(num + " ");
            }
            System.out.println();
        }

    }
}
