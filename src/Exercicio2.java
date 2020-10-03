
import javax.swing.JOptionPane;


public class Exercicio2 {
    
    public static void main(String[] args) {
        
        int num=0, par=0, impar=0;
        
        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+" numero: "));
            
            if (num%2==0) {
                par++;
            }else{
                impar++;
            }
        }
        
        JOptionPane.showMessageDialog(null, 
                "Quantidade de numeros pares: "+ par
                +"\nQuantidade de numeros impares: " + impar);
    }
    
}
