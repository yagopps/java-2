/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ4;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Ativ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String V = "Vogal";
        
        V = (JOptionPane.showInputDialog("Digite uma letra"));
        
        if(V.equals("a")|| V.equals ("e")|| V.equals ("i")|| V.equals ("o")|| V.equals ("u"))
        {
            JOptionPane.showMessageDialog(null , V + " é vogal");
        }
         
        else
        {
            JOptionPane.showMessageDialog(null, V + " é consoante");
        }
        // TODO code application logic here
    }

}
