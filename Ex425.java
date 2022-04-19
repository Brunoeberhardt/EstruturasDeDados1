import javax.swing.JOptionPane;

public class Ex425 {
    public static void main(String[] args) throws Exception {
        int linha;
        int quantidade[][] = new int[50][3];
        String nome[] = new String[50];

        for(linha=0; linha<4; linha++){
            nome[linha] = JOptionPane.showInputDialog("Nome da Planta!: ");
            quantidade[linha][0] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque: "));
            quantidade[linha][1] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade ideal: "));
            if(quantidade[linha][0] < quantidade[linha][1]){
                quantidade[linha][2] = quantidade[linha][1] - quantidade[linha][0];
            }else{
                quantidade[linha][2] = 0;
            }
        }
        JOptionPane.showMessageDialog(null, "Total de compras!");
        for(linha=0; linha<50; linha++){
            System.out.println(nome[linha] + " - " + quantidade[linha][2]);
        }   
    }
}