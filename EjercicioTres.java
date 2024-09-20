public class EjercicioTres {
    public static void main(String[] args) {
        int numfav = 13;
        int edad = 19;
        
        numfav = numfav + edad; 
        edad = numfav - edad;
        numfav = numfav - edad;

        System.out.println(edad);
        System.out.println(numfav);
    }
}