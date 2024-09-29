public class EjercicioTreinta {
    public static void main(String[] args) {
        int[][] matrizUno = {
            {9, 8, 7},
            {7, 8, 9},
            {8, 5, 6}
        };
        int filas = matrizUno.length;
        int columnas = matrizUno[0].length;
        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i=0; i<filas; i++) {
            for(int x=0; x<columnas; x++) {
                matrizTranspuesta[x][i] = matrizUno[i][x];
            }
        }
        System.out.println("Matriz transpuesta ");
        for(int i=0; i<matrizTranspuesta.length; i++) {
            for(int x=0; x<matrizTranspuesta[i].length; x++){
                System.out.print(matrizTranspuesta[i][x] + " ");
            }
            System.out.println();
        }
    }
}
