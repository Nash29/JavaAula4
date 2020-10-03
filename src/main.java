
import javax.swing.JOptionPane;


public class main {
    
    public static void main(String[] args) {
        String menu = "Opções de menu"
                + "\n1 - Exemplo 1"
                + "\n2 - Exemplo 2"
                + "\n3 - Exemplo 3"
                + "\n4 - Exercicio 1"
                + "\n5 - Exercicio 2"
                + "\n6 - Exercicio 3"
                + "\n7 - Exercicio 4"
                + "\n8 - Exercicio 5"
                + "\n9 - Exercicio 6"
                + "\n10 - Exercicio 7"
                + "\n11 - Exercicio 8"
                + "\n12 - Exercicio 9"
                + "\n13 - Exercicio 10"
                + "\n14 - Exercicio 11"
                + "\n15 - Exercicio 12"
                + "\n16 - Exercicio 13"
                + "\n17 - Exercicio 14"
                + "\n Digite uma opção:"; 
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch (opcao) {
            case 1:
                Exemplo1.main(args);
                break;
            case 2:
                Exemplo2.main(args);
                break;
            case 3:
                Exemplo3.main(args);
                break;
            case 4:
                Exercicio1.main(args);
                break;
            case 5:
                Exercicio2.main(args);
                break;
            case 6:
                Exercicio3.main(args);
                break;
            case 7:
                Exercicio4.main(args);
                break;
            case 8:
                Exercicio5.main(args);
                break;
            case 9:
                Exercicio6.main(args);
                break;
            case 10:
                Exercicio7.main(args);
                break;
            case 11:
                Exercicio8.main(args);
                break;
            case 12:
                Exercicio9.main(args);
                break;
            case 13:
                Exercicio10.main(args);
                break;
            case 14:
                Exercicio11.main(args);
                break;
            case 15:
                Exercicio12.main(args);
                break;
            case 16:
                Exercicio13.main(args);
                break;
            case 17:
                Exercicio14.main(args);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida!");
        }
    }
    
}
