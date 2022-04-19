import javax.swing.JOptionPane;

public class Ex412 {
    public static void main(String[] args) {
        int n[][] = new int[5][5];
        int linha;
        int coluna;
        
        for(linha = 0; linha<5; linha ++){
            for(coluna = 0; coluna <5; coluna++){
                n[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite elemento: "));
            }
        }
        JOptionPane.showMessageDialog(null, "Toda a Matriz");
        for(linha = 0; linha<5; linha++){
            for(coluna = 0; coluna <5; coluna++){
                System.out.print(n[linha][coluna] + "\t");
            }
            System.out.print("\n");
        }
        JOptionPane.showMessageDialog(null, "Os elementos nas posicoes cuja linha mais coluna resulta num par");
        for(linha=0; linha<5; linha++){
            for(coluna=0; coluna<5; coluna++){
                if((linha+coluna)%2 == 0){
                    System.out.print(n[linha][coluna]);
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}