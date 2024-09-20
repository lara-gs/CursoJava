import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige un numero");
        a = scanner.nextInt();
        System.out.println("Elige un numero");
        b = scanner.nextInt();
        int resultado = a + b;
        System.out.println("Esta es la suma de tus dos numeros " + resultado);
        scanner.close();



    }
}
