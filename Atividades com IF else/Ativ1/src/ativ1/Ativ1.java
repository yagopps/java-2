/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

        int n1 = 10;
        int n2 = 20;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        if (n1 > n2) {
            n1 = n2;
            JOptionPane.showMessageDialog(null, "Maior que 20:");
                   
        } else if (n2 < n1) {
            JOptionPane.showMessageDialog(null, "Menor:");
        } else {
            JOptionPane.showMessageDialog(null, "Menor que 20:");
       
        }
        

        // TODO code application logic here
    }

}
