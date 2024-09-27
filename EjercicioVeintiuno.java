import java.util.Scanner;

public class EjercicioVeintiuno {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    
    int numNatural = 0;
    int numTope = 0;
    int suma = 0;

    System.out.println("Introduce el numero tope que quieras para la suma de numeros naturales ");
    numTope = scanner.nextInt();

    while(suma <= numTope){
        numNatural = numNatural + 1;
        suma = suma + numNatural;
    } 
    System.out.println("La suma de los numeros naturales hasta el tope es: " + (suma - numNatural));
    scanner.close();

    }
}
