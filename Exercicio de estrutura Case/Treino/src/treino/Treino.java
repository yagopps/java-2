/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treino;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Treino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;
        int opc = 0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
                + "1.Soma\n"
                + "2.Subtração\n"
                + "3.Divisão\n"
                + "4.Multiplicação\n"
                + "5.Resto da divisão\n"));

        switch (opc) {
            case 1:
                JOptionPane.showMessageDialog(null, "O resultado da soma é: " + (n1 + n2));
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + (n1 - n2));
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + (n1 / n2));
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + (n1 * n2));
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "O resultado do resto da divisão é: " + (n1 % n2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");

        }
    }

}
