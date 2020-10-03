
import javax.swing.JOptionPane;


public class Exercicio6 {
    
    public static void main(String[] args) {
        
        int idade=0, maior=0;
        
        for (int i = 0; i < 10; i++) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do "+(i+1)+" aluno: "));
            
            if (i == 0 || idade > maior) {
                maior = idade;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A maior idade é: " + maior);
    }
    
}
