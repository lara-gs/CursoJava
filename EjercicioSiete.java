import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Operaciones matemáticas con expresiones simples");
          System.out.println("Introduce el primer número ");
          double primerNumero = scanner.nextDouble();
          System.out.println("Introduce el operador (+, -, *, /)");
          String primerOperador = scanner.next();
          System.out.println("Introduce el segundo número ");
          double segundoNumero = scanner.nextDouble();
          System.out.println("Introduce el siguiente operador (+, -, *, /)");
          String segundoOperador = scanner.next();
          System.out.println("Introduce el tercer número ");
          double tercerNumero = scanner.nextDouble();

          double resultado = 0;

          if(primerOperador.equals("*")) {
            resultado = primerNumero * segundoNumero;
          }else if(primerOperador.equals("/")) {
          resultado = primerNumero / segundoNumero;
          }else if(primerOperador.equals("-")) {
          resultado = primerNumero - segundoNumero;
          }else if(primerOperador.equals("+"))  {
          resultado = primerNumero + segundoNumero;

          }else{
          System.out.println("Has introducido un operador no válido");
          }


          if(segundoOperador.equals("*")) {
          resultado = resultado * tercerNumero;
          } else if(segundoOperador.equals("/")) {
          resultado = resultado / tercerNumero;
          } else if(segundoOperador.equals("-")) {
          resultado = resultado - tercerNumero;
          }else if(segundoOperador.equals("+")){
          resultado = resultado - tercerNumero;
    
      }else {
      System.out.println("Has introducido un operador no válido");
      }
      System.out.println("Este es el resultado de tu operación " + resultado);
      scanner.close();

      }


}