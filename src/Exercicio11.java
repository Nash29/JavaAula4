
import javax.swing.JOptionPane;


public class Exercicio11 {
    
    public static void main(String[] args) {
        
        int codigo=0, quant=0;
        double val=0, total=0;
        String resp=null;
        
        for (int i = 0; i < 10; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do "+(i+1)+" produto: "));
            quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas do "+(i+1)+" produto: "));
            
            switch (codigo) {
                case 1:
                    val = quant * 2.99;
                    break;
                case 2:
                    val = quant * 2.19;
                    break;
                case 3:
                    val = quant * 0.99;
                    break;
                default:
                    break;
            }
            
            resp = "Valor da venda do "+(i+1)+" produto: " + val;
            JOptionPane.showMessageDialog(null, 
                "\n"+resp);
            total +=val;
        }
        
        JOptionPane.showMessageDialog(null,
                "\nValor total: "+ total);
    }
    
}
