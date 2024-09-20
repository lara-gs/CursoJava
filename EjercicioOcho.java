import java.util.Scanner;


public class EjercicioOcho {

	public static void main(String[] args)
	{
		int radio;


        Scanner entrada = new Scanner( System.in );
        System.out.print("Introduce el radio del círculo: ");
        radio = entrada.nextInt();
        System.out.printf("El diametro del círculo es: %f. ", (Math.PI * radio * radio ) );
        // usamos %f porque esperamos que el valor a poner nos lo dira la siguiente cadena, o eso es lo que he entendido
}

}