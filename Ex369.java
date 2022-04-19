import javax.swing.JOptionPane;

public class Ex369{
    public static void main(String[] args) {
        int mesa[] = new int[30];
        int qtde[] = new int[30];
        int i,lugares,codigo,lugmesa;
         
        for(i = 0; i < 30; i++){
            mesa[i] = 100 + i;
            qtde[i] = 5;
        }
        lugares = 150;

        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo 100-129 ou 0 para terminar: "));

        while(codigo > 0 && lugares != 0){
            i = 0;

            while(codigo != mesa[i] && i <29){
                i++;
            }
            if(codigo == mesa[i]){
                lugmesa = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de lugares a reservar:"));

                if(qtde[i] >= lugmesa){
                    qtde[i] -= lugmesa;
                    lugares -= lugmesa;
                }else{
                JOptionPane.showMessageDialog(null, "Nao ha lugares a reservar");
                }
            }else{
                    JOptionPane.showMessageDialog(null, "codigo de mesa invalido");
            }
            codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo 100-129 ou 0 para terminar: "));
        }
        if(lugares == 0){
            JOptionPane.showMessageDialog(null, "Lotacao esgotada");
        }else{
            JOptionPane.showMessageDialog(null, "Lugares vagos");
            for(i = 0; i < 30; i++){
                if(qtde[i] != 0){
                    System.out.println("mesa: "+mesa[i]+" total de lugares: "+qtde[i]);
                }
            }
        }
    }
}