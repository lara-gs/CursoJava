public class EjercicioVeintisiete {
    
    public static void main(String[] args) {
        int[] enteros = {1, 92, 33, 140, 253, 564, 71, 800, 19, 120, 50};
    int max = enteros[0];
    for(int i = 1; i< enteros.length; i++)
        if(enteros[i] > max){
            max = enteros[i];
        }
    System.out.println("El elemento mayor es " + max);

    
    
    }
}
