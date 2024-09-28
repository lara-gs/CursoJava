import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioTreintaicinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean introduce = true;
        ArrayList<Integer> lista = new ArrayList<>();
        int suma = 0;

        while (introduce) {
            System.out.println(
                    "Introduce numeros para añadirlos a una 'ArrayList' y posteriormente sumarlos. Pulsa una letra cuando hayas acabado ");
            String introducido = input.nextLine();

            try {
                int numero = Integer.parseInt(introducido);
                lista.add(numero);
                suma = suma + numero;

            } catch (Exception e) {
                introduce = false;
            }
        }
        System.out.println("Esta es tu 'ArrayList' " + lista);
        System.out.println("Esta es la suma de tu 'Arraylist " + suma);
        input.close();
    }
}
