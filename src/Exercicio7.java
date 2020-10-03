
import javax.swing.JOptionPane;


public class Exercicio7 {
    
    public static void main(String[] args) {
        
        int idade=0, maior=0, menor=0;
        double media=0;
        
        for (int i = 0; i < 10; i++) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do "+(i+1)+" aluno: "));
            
            if (i == 0) {
                maior = idade;
                menor = idade;
            }
            
            if (idade > maior) {
                maior = idade;
            }else if (idade < menor) {
                menor = idade;
            }
            
        }
        
        media = (maior + menor)/2;
        
        JOptionPane.showMessageDialog(null, 
                "Valor da maior idade: "+ maior
                +"\nValor da menor idade: "+menor
                +"\nMedia da idades: "+ media);
    }
    
}
