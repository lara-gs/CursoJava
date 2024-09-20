import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
         int edad;
         double peso;
         String nombre;

         Scanner scanner = new Scanner(System.in);
         System.out.println("Escribe tu edad");
         edad = scanner.nextInt();
         System.out.println("Escribe tu peso");
         peso = scanner.nextDouble();
         System.out.println("Escribe tu nombre");
         nombre = scanner.next();

        scanner.close();

         System.out.println("Esta edad es " + edad);
         System.out.println("Este es tu peso " + peso);
         System.out.println("Este es tu nombre " + nombre);
    }
}
