
import javax.swing.JOptionPane;


public class Exercicio4 {
    
    public static void main(String[] args) {
        
        int num=0, quanti=0, soma=0;
        double media=0;
        
        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+" numero: "));
            
            if (num >= 70 && num <= 90 ) {
                quanti++;
                soma+=num;
                media = soma /quanti;
            }
        }
        
        JOptionPane.showMessageDialog(null, 
                "Quantidade de numeros entre 70 e 90: " + quanti
                +"\nA soma dos numeros entre 70 e 90: "+soma
                +String.format("\nA media dos numeros entre 70 e 90: %.2f", media));
                
    }
    
}
