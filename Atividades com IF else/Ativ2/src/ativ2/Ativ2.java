/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ2;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ativ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int n1 = 0;
        int n2 = 0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        if (n1>0) {
            JOptionPane.showMessageDialog(null, "Positivo:");
                   
        } else if (n2<0) {
            JOptionPane.showMessageDialog(null, "Menor:");
        } else {
            JOptionPane.showMessageDialog(null, "Negativo:");
       
        }
        
        // TODO code application logic here
    }
    
}
