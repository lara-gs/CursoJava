import java.util.Scanner;


public class EjercicioQuince {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero = 0;

        System.out.println("Introduce un numero para saber si es par o impar ");
        numero = input.nextInt();

        if((numero % 2) == 0){
            System.out.println(numero + " es un numero par");
            
        }else{
            System.out.println(numero + " es un numero impar");

        input.close();
        }
    }
}
