import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double height = 0;
        boolean validInput = false;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        
        while (!validInput) {
            String input = JOptionPane.showInputDialog(null, "Informe sua altura (m)");
            try {
                height = Double.parseDouble(input);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        double idealWeight = (72.7 * height) - 58;
        JOptionPane.showMessageDialog(null, "Seu peso ideal é " + numberFormat.format(idealWeight) + " kg");
    }
}