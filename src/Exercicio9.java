
import javax.swing.JOptionPane;


public class Exercicio9 {
    
    public static void main(String[] args) {
        
        int voto, quantMonteiro = 0, quantiEuclides = 0;
        String resultado=null;
        
        for (int i = 0; i < 10; i++) {
            voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+" voto: "));
            
            if (voto == 10) {
                quantMonteiro++;
            }else if (voto == 35) {
                quantiEuclides++;
            }
            
            if (quantMonteiro > quantiEuclides) {
                resultado = "Monteiro venceu";
            }else{
                resultado = "Euclides venceu";
            }
            
        }
        
        JOptionPane.showMessageDialog(null,
                "Monteiro recebeu "+quantMonteiro+" votos"
                +"\nEuclides recebeu "+quantiEuclides+" votos"
                +"\nNome do vencedor: "+resultado);
    }
    
}
