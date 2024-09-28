import java.util.Scanner;
public class EjercicioTreintaidos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe una cadena para saber cuantas vocales tiene ");
        String palabra = input.nextLine();
        palabra = palabra.toLowerCase();

        int contadorVocales = 0;
        
        for (int i=0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || 
            caracter == 'o' || caracter == 'u')
        {
        contadorVocales++;
        }
    }
    System.out.println("Tu cadena tiene " + contadorVocales + " vocales");
    input.close();
}
}
