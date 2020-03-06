
package ex.pkg1.aula.pkg11;
import javax.swing.JOptionPane;
public class EX1Aula11 {

    
    
   
    
    public static void main(String[] args) {
  
        int num = 0 ;
        int tab = 0;
        
        tab = Integer.parseInt(JOptionPane.showInputDialog("digite um numero para a tabuada :"));
        
        while(num >= 10){
             JOptionPane.showMessageDialog(null, tab + " x " + num + " = " + tab * num);
             num--;
             
        }
    }
} 
