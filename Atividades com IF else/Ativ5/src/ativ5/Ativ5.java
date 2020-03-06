/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ5;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Ativ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 7;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota:"));
        if (n1 > n2) {
            n1 = n2;
            JOptionPane.showMessageDialog(null, "Aprovado");
                   
        } else if (n2 <  n1) {
         
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
       
        }
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
