
import javax.swing.JOptionPane;


public class Exemplo2 {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i+=2) 
            JOptionPane.showMessageDialog(null, "Valor de i: " + (i+1));
    }
    
}
