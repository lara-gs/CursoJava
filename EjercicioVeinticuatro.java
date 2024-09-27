import java.util.Scanner;
public class EjercicioVeinticuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero para saber su factorial ");
        int num = scanner.nextInt();

        
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }
        System.out.println("El factorial es " + factorial);

    scanner.close();
    }

}
