import java.util.Scanner;
public class EjercicioVeintitres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int num = 0;
        System.out.println("Elige un numero para mostrarte su tabla de multiplicar ");
        num = scanner.nextInt();


        for(int multiplicador=0;multiplicador<=10;multiplicador++){
        System.out.println(multiplicador * num );
        
        }
        scanner.close();
    }
    
    
}
