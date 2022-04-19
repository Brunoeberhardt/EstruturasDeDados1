import javax.swing.JOptionPane;

public class Ex404 {
    public static void main(String[] args) throws Exception {
        int N[][] = new int[10][10];
        int linha;
        int coluna;

        for(linha = 0; linha <=9; linha++){
            for(coluna = 0; coluna <=9; coluna++){
                N[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Entre com elemento linha " + (linha+1) + "  coluna " + (coluna+1)));
            }
        }

        JOptionPane.showMessageDialog(null, "ACIMA DA DIAGONAL PRINCIPAL");
        for(linha = 0; linha <=8; linha++){
            for(coluna = linha+1; coluna <=9; coluna++){
                System.out.print("\t" + N[linha][coluna]);
            }
            System.out.print("\n");
            for(int t = 0; t <= linha; t++){
                System.out.print("\t");
            }
        }
    }
}