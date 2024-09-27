import java.util.Scanner;

public class EjercicioVeintidos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int intento = 0;
        int numSecreto = 0;
        boolean acierto = false;
        numSecreto = (int) (Math.random() * 100 + 1);

        while (!acierto) {
            System.out.println("Adivina el numero del 1 al 100 ");
            intento = scanner.nextInt();
            

            if (intento != numSecreto) {
                System.out.println("Intentalo de nuevo");

            } else {
                System.out.println("¡Has acertado! El numero secreto era " + numSecreto);
                acierto = true;
            }
        }
        scanner.close();
    }
}
