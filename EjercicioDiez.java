import javax.swing.JOptionPane;

public class EjercicioDiez {

    public static void main(String[] args) {
        
            
            String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
            int opcion = JOptionPane.showOptionDialog(null, "Selecciona una operación", "Calculadora",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            try {
                
                String input1 = JOptionPane.showInputDialog("Ingresa el primer número:");
                double num1 = Double.parseDouble(input1);

                String input2 = JOptionPane.showInputDialog("Ingresa el segundo número:");
                double num2 = Double.parseDouble(input2);

                double resultado = 0;

                
                switch (opcion) {
                    case 0:
                        resultado = num1 + num2;
                        break;
                    case 1:
                        resultado = num1 - num2;
                        break;
                    case 2:
                        resultado = num1 * num2;
                        break;
                    case 3:
                        resultado = num1 / num2;
                        break;
                }

                
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

            } catch (NumberFormatException e) {
                
        
            }
        }
}
