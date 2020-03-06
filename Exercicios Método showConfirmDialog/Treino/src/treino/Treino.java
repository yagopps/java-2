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
        String nome = "";
        int resposta = 0;
        
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é: " + nome + "?");
         if (resposta == JOptionPane.YES_OPTION){
             JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
           
         }else{
             JOptionPane.showMessageDialog(null, "Seu nome não é: " + nome);
         
          
             
         } 
                     
        
    }
    
}
