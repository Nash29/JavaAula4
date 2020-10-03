
import javax.swing.JOptionPane;


public class Exercicio12 {
    
    public static void main(String[] args) {
        
        double sal=0, mediaSal=0, mediaFilho=0;
        int numFilhos=0, quant=0, quantTotal=0, somaSal=0, somaFilhos=0;
        
        for (int i = 0; i < 10; i++) {
            sal =Double.parseDouble(JOptionPane.showInputDialog("Digite o salario da "+(i+1)+" pessoa: "));
            numFilhos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de filhos da "+(i+1)+" pessoa: "));
            
            quantTotal++;
            somaSal += sal;
            somaFilhos += numFilhos;
            
            if (sal < 700) {
                quant++;
            }
            
            mediaSal = somaSal /quantTotal;
            mediaFilho = somaFilhos /quantTotal;
        }
        
        JOptionPane.showMessageDialog(null, 
                "Media Salaria da População: " + mediaSal
                +"\nMedia do numero de filhos: "+ mediaFilho
                +"\nQuantidade de salarios abaixo de R$700: " + quant);
    }
    
}
