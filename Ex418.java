import javax.swing.JOptionPane;

public class Ex418 {
    public static void main(String[] args) throws Exception {
        int a[][] = new int[4][4];
        int b[][] = new int[4][4];
        int soma[][] = new int[4][4];
        int linha;
        int coluna;
        
        for(linha = 0; linha<4; linha++){
            for(coluna = 0; coluna<4; coluna++){
                a[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de A: "));
            }
        }
        for(linha = 0; linha<4; linha++){
            for(coluna = 0; coluna<4; coluna++){
                b[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de B: "));
                soma[linha][coluna] = a[linha][coluna] + b[linha][coluna];
            }
        }
        JOptionPane.showMessageDialog(null, "MATRIZ SOMA");
        for(linha = 0; linha<4; linha++){
            for(coluna = 0; coluna <4; coluna++){
                System.out.print(soma[linha][coluna] + "\t");
            }
            System.out.print("\n");
        }
    }
}