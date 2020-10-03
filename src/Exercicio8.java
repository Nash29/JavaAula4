
import javax.swing.JOptionPane;


public class Exercicio8 {
    
    public static void main(String[] args) {
        
        int idade=0, maior=0;
        String nome=null, nomeMaior=null;
        
        for (int i = 0; i < 10; i++) {
            nome = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+" aluno: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do "+(i+1)+" aluno: "));
            
            if (i == 0) {
                maior = idade;
                nomeMaior = nome;
            }
            
            if (idade > maior) {
                maior = idade;
                nomeMaior = nome;
            }
        }
        
        JOptionPane.showMessageDialog(null, 
                "O aluno mais velho é o: " + nomeMaior);
    }
    
}
