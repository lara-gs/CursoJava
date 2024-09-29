import java.util.Scanner;

public class EjercicioVeinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        System.out.println("Introduce un numero ");
        num = scanner.nextInt();

        if(num>=0 && num%2==0) {
        System.out.println("Tu numero es entero y par");

        }else if(num<=0 || (num%3==0)){
        System.out.println("Tu numero es negativo o impar ");
        }
        scanner.close();



    }
    
}
