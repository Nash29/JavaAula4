
import javax.swing.JOptionPane;


public class Exercicio5 {
    
    public static void main(String[] args) {
        
        int idade=0, quanti1a10=0, quanti11a17 = 0, quantiMaior=0;
        
        for (int i = 0; i < 10; i++) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da "+(i+1)+" pessoa: "));
            
            if (idade >=1 && idade <= 10) {
                quanti1a10++;
            }else if (idade >=11 && idade <= 17) {
                quanti11a17++;
            }else{
                quantiMaior++;
            }
        }
        
        JOptionPane.showMessageDialog(null, 
                "Quantidade de pessoas entre 1 a 10 anos: "+quanti1a10
                +"\nQuantidade de pessoas entre 11 a 17 anos: "+quanti11a17
                +"\nQuantidade de pessoa maior de 18 anos: "+quantiMaior);
    }
    
}
