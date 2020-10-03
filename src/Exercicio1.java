
import javax.swing.JOptionPane;


public class Exercicio1 {
    
    public static void main(String[] args) {
        
        int num = 0, maior=0, menor=0;
        
        for (int i = 0; i < 10; i++) {
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+" numero: "));
            
            if (num > 10){
                maior++;
            }else{
                menor++;
            }
        }
        
        JOptionPane.showMessageDialog(null, 
                "Quantidade de numeros maior que 10: " + maior
                +"\nQuantidade de numeros menor que 10: " + menor);
    }
    
}
