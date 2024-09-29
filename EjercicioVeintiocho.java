public class EjercicioVeintiocho {

    public static void main(String[] args) {

        int[] enteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int[] invertido = new int[enteros.length];

        for (int i = 0; i < enteros.length; i++) {
            invertido[i] = enteros[enteros.length - 1 - i];
        }
        
        System.out.println("Array invertida ");

        for (int num : invertido) {
            System.out.print(num + " ");
        }

    }
}
