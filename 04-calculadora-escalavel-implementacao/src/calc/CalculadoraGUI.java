package calc;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CalculadoraGUI {
    
    public static void main (String args[]) {
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        JComboBox<Operacoes> combo = new JComboBox<>(Operacoes.values());
        JOptionPane.showMessageDialog(null, new Object[] {"Escolha a operação", combo});
        
        Operacoes operacao = combo.getItemAt(combo.getSelectedIndex());
        JOptionPane.showMessageDialog(null, "Resultado = " + operacao.calcula(n1, n2));
    }
}
