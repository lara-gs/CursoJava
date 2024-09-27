import java.util.Scanner;

public class EjercicioDiecinueve {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        
        int edad = 0;
        System.out.println("¿Cual es tu edad?");
        edad = scanner.nextInt();

        if(!(edad == 18) && edad < 18) {
        System.out.println("No puedes votar.");
        }else{
        System.out.println( "Puedes votar.");
        }

    scanner.close();
    }
}
