public class EjercicioDieciocho {
    public static void main(String[] args) {
        

        System.out.println("Escribe un numero del 1 al 7 para saber a que dia de la semana corresponde");
        int numSemana = Integer.parseInt(System.console().readLine());

        switch (numSemana) {
            case 1:
            System.out.println("Lunes");
            break;
            case 2:
            System.out.println("Martes");
            break;
            case 3:
            System.out.println("Miercoles");
            break;
            case 4:
            System.out.println("Jueves");
            break;
            case 5:
            System.out.println("Viernes");
            break;
            case 6:
            System.out.println("Sabado");
            break;
            case 7:
            System.out.println("Domingo");
            break;

            default:
            System.out.println("Solo validos numeros del 1 al 7.");

        }
    }
}
