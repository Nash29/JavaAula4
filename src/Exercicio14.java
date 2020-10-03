
import javax.swing.JOptionPane;


public class Exercicio14 {
    
    public static void main(String[] args) {
        
        double nota1=0, nota2=0, media=0, I=0, R=0, B=0, MB=0;
        
        for (int i = 0; i < 5; i++) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota do "+(i+1)+" aluno: "));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota do "+(i+1)+" aluno: "));
            
            media = (nota1 + nota2)/2;
            
            if (media >= 0 && media <=3.9) {
                I++;
            }else if (media >= 4 && media <=6.4) {
                R++;
            }else if (media >= 6.5 && media <=8.9) {
                B++;
            }else if (media >= 9 && media <=10) {
                MB++;
            }
        }
        
        JOptionPane.showMessageDialog(null, 
                "Menções I: " + I
                +"\nMenções R: "+R
                +"\nMenções B: "+B
                +"\nMensões MB: "+MB);
    }
    
}
