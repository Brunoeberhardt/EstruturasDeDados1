import javax.swing.JOptionPane;

public class Ex358 {
    public static void main(String[] args) {
        float precoCompra[] = new float[10];
        float precoVenda[] = new float[10];
        float lucro;
        int lucroMenor20 = 0;
        int lucroMaior20 = 0;
        int lucroMenor10 = 0;

        for(int i=0;i<10;i++){
            precoCompra[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o preco de compra: "));
            precoVenda[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o preco de venda"));
            lucro = precoVenda[i] - precoCompra[i];

            if(lucro<10){
                lucroMenor10++;
            }else{
                if(lucro<=20){
                    lucroMenor20++;
                }else{
                    lucroMaior20++;
            
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Total de mercadorias com lucro < 10: "+lucroMenor10+"\nTotal de mercadorias com lucro <= 20: "+lucroMenor20+"\nTotal de mercadorias com lucro >20: "+lucroMaior20);
    }
}
