import java.util.Scanner;
public class EjercicioTreintaiuno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe una palabra para saber si es un palindromo o no");
        String palabra = input.nextLine();
        
        String lectura = "";
        for(int i=palabra.length()-1; i>=0; i--) {
            lectura = lectura + palabra.charAt(i);
        } 
        if (palabra.equalsIgnoreCase(lectura)) {
            System.out.println(palabra + " es un palindromo");
        } else {
            System.out.println(palabra + " no es un palindromo");
        }
        input.close();
    }
}
