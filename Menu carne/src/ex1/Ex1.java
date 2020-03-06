/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opc1 = 0;
        int opc2 = 0;
        double a = 0;
        int b = 0;
        opc1 = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção\n"
                + "1.File duplo - 5,80 kg \n"
                + "2.Alcatra- 6,80 kg \n"
                + "3.Picanha- 7,80 kg"));

        switch (opc1) {

            case 1:
                JOptionPane.showMessageDialog(null, "file duplo");
                a = 5.80;
                b = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade que voce deseja?"));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "alcatra");
                a = 6.80;
                b = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade que voce deseja?"));
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "picanha");
                a = 7.80;
                b = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade que voce deseja?"));
                break;

            default:
                JOptionPane.showMessageDialog(null, "digite uma opção válida");

        }
        opc2 = Integer.parseInt(JOptionPane.showInputDialog("Forma de pagamento ?\n"
                + "1. Cartao de credito ou debito / 5% de desconto \n"
                + "2. Dinheiro"));

        switch (opc2) {

            case 1:
                JOptionPane.showMessageDialog(null, "Valor total: " + (a * b - b * 5 / 100));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Valor total: " + (a * b));

        }

    }

}
