public class EjercicioCatorce {
    public static void main(String[] args) {
        
        String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        boolean tieneNumero = false;
        String psw = "";
        for(int numeroDeCaracteres=0;numeroDeCaracteres <8;numeroDeCaracteres++){
            int posicion = (int) (Math.random() *62);
            String siguienteCaracter = caracteres.charAt(posicion) + "";

            try{
                Double.parseDouble(siguienteCaracter);
                tieneNumero = true;
            }catch(NumberFormatException e){
                
            }

            if(numeroDeCaracteres == 7 && !tieneNumero){
                int posicionNumero = (int) (Math.random() *9);
                psw = psw + caracteres.charAt(posicionNumero);
            }
            else{
                psw = psw + siguienteCaracter;
            }
            



        }
        System.out.println("Esta es tu contraseña " + psw);
    }
}
