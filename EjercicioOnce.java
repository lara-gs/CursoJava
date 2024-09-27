import javax.swing.JOptionPane;
public class EjercicioOnce {
    public static void main(String[] args) {
        
        String[] operaciones = {"Potencia", "Raiz Cuadrada", "Numero absoluto"};
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona una operación", "",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operaciones, operaciones[1]);

        try {

            switch (opcion) {
                case 0:
                String input1 = JOptionPane.showInputDialog("Ingresa un número:");
                double num1 = Double.parseDouble(input1);

                String input2 = JOptionPane.showInputDialog("Ingresa la potencia:");
                double num2 = Double.parseDouble(input2);
                double resultado = Math.pow(num1,num2);
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                    break;
            
                case 1:
                String input3 = JOptionPane.showInputDialog("Ingresa un numero");
                double num3 = Double.parseDouble(input3);
                double resultado2 = Math.sqrt(num3);
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado2);

                    break;

                case 2:
                String input4 =JOptionPane.showInputDialog("Ingresa un numero ");
                double num4 = Double.parseDouble(input4);
                double resultado3 = Math.abs(num4);
                JOptionPane.showMessageDialog(null,"Resultado: " + resultado3);
                    
                    break;
            }


        } catch (Exception e) {
            
        }

    }
}
