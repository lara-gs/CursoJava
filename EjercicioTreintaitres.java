import java.util.Scanner;
public class EjercicioTreintaitres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero y le sumaremos 10 ");
        String cadena = scanner.nextLine();
        int numeroEntero = Integer.parseInt(cadena);
        int resultado = (numeroEntero +10);
        

        System.out.println("Este es el resultado de tu cadena " + resultado);

        scanner.close();
    }
    
}
