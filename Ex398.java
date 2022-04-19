import javax.swing.JOptionPane;

public class Ex398 {
    public static void main(String[] args) {
        int codigo[] = new  int[50];
        int quantidade[] = new int[50];
        float preco[] = new float[50];
        float codVenda;
        int quantidadeVenda = 0, geral = 0, cod = 0, venda = 0, k;

        
        for(int i = 0; i < 50; i++){
            codigo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do produto 0 - 49\nDigite -1 para finalizar cadastramento"));
            if(codigo[i] == -1){
                JOptionPane.showMessageDialog(null, "Operacao finalizada");
                break;
            }else{
                quantidade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade em estoque do produto"));
                preco[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o preco do produto"));
                cod++;

            }     
        }
        do{
            codVenda = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o codigo do produto para venda\nDigite -1 para finalizar as vendas"));
            if(codVenda != 0){
                for(k = 0; k<50; k++){
                    if(codigo[k] == codVenda){
                        quantidadeVenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade para vender: "));
                        if(quantidadeVenda <= quantidade[k]){
                            venda += quantidadeVenda;
                            quantidade[k] -= quantidadeVenda;
                            geral += preco[k];
                            JOptionPane.showMessageDialog(null, "Vendido");
                            k = 60;
                        }else{
                            JOptionPane.showMessageDialog(null, "Quantidade indisponivel");
                            k = 60;
                        }
                    }else{
                        k = 60;
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Codigo indisponivel");
            }
            
        }while(cod != -1);
        System.out.println("Total vendido no dia: "+geral+"\nProdutos disponiveis\tQtd. do produto");
        for(int i = 0; i < 50; i++){
        System.out.printf(codigo[i]+"\t"+quantidade[i], venda);
        }
    }
}
