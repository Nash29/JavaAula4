
import javax.swing.JOptionPane;


public class Exemplo3 {
    
    public static void main(String[] args) {
        
        int num =0, total=0, quat=0;
        
        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+" numero: "));
            total+=num;
            quat++;
        }
        
        JOptionPane.showMessageDialog(null, 
                "A soma dos numeros digitados foi de: "+total
                +"\nForam digitados "+quat+" numeros");
    }
    
}
