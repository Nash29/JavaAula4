
import javax.swing.JOptionPane;


public class Exercicio3 {
    
    public static void main(String[] args) {
        
        int num=0, quanti=0;
        
        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+" numero: "));
            
            if (num >=10 && num<=20) {
                quanti++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Quantidade de numeros entre 10 e 20: " + quanti);
    }
    
}
