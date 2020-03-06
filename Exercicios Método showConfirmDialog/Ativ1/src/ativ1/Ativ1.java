package ativ1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ativ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "Allan" ;
        int idade = 0, resposta = 0;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade ?" + " " + nome));
        resposta = JOptionPane.showConfirmDialog(null, "A sua idade é: " + idade + "?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + " " + nome);

        } else {
            JOptionPane.showMessageDialog(null, "Sua idade não é: " + idade + " " + nome);
        }

    }

}
