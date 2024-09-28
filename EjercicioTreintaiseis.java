import java.util.ArrayList;

public class EjercicioTreintaiseis {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(java.util.Arrays.asList("cangrejo", "sandia", "lentejuelas", "boton", "lentejuelas", "dedo"));
        ArrayList<String> listaLimpia = new ArrayList<>();

        for (String i : lista) {
            if(!listaLimpia.contains(i)) {
                listaLimpia.add(i);
            }
            
        }
        System.out.println("Lista con duplicados " + lista);
        System.out.println("Lista sin duplicados " + listaLimpia);
    }
}
