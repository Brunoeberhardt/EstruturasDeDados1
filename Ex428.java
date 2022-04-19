import javax.swing.JOptionPane;

public class Ex428 {
    public static void main(String[] args) throws Exception {

        int dados[][] = new int[10][4];
        int linha, codigo, pos, aux;

        for(linha=0; linha<10; linha++){
            dados[linha][0] = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula formato aascccnnn: "));
            aux = dados[linha][0] / 1000000;
            aux = dados[linha][0] - aux * 1000000;
            dados[linha][2] = aux / 1000;
            dados[linha][1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o Sexo (0 Fem\t1 Masc)"));
            dados[linha][3] = Integer.parseInt(JOptionPane.showInputDialog("Digit o CR do aluno(a): "));
        }
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo do curso"));
        pos = 0;
        for(linha=0; linha<10; linha++){
            if(dados[linha][2] == codigo && dados[linha][0]==0){
                pos = linha;
            }else if(dados[linha][3] > dados[pos][3]){
                pos = linha;
            }
        }
        JOptionPane.showMessageDialog(null, "Aluna premiada matricula: " + dados[pos][0] + " teve CR: " + dados[pos][3]);   
    }
}