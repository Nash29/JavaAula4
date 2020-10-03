
import javax.swing.JOptionPane;


public class Exercicio13 {
   
    
    public static void main(String[] args) {
        
        int adultos=0, criancas=0, numAdultos=0, numCriancas=0, total=0;
        
        for (int i = 0; i < 10; i++) {
            adultos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos adultos vivem na "+(i+1)+" casa: "));
            criancas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos crianças vivem na "+(i+1)+" casa: "));
            
            numAdultos += adultos;
            numCriancas += criancas;
            total = numAdultos +numCriancas;
        }
        
        JOptionPane.showMessageDialog(null, 
                "Total de adultos: "+ numAdultos
                +"\nTotal de crianças: "+ numCriancas
                +"\nTotal do total: "+ total);
    }
    
}
