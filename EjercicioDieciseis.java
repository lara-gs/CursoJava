import java.time.Year;
import java.util.Scanner;

public class EjercicioDieciseis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un un año para saber si es bisiesto ");
        long year = input.nextLong();

        if(Year.isLeap(year)) {
            System.out.println(year + " si es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
        input.close();

        }

    }

