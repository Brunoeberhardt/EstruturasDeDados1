import javax.swing.JOptionPane;

public class Ex360 {
    public static void main(String[] args) {
        int ultdia[] = new int[12];
        int data,dia,mes;
        String signo[] = new String[12];

        for(int i=0;i<12;i++){
            signo[i] = JOptionPane.showInputDialog(null, "Digite o signo:");
            ultdia[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ultimo dia:"));
        }
        data = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a data no formato ddmm ou 9999 para terminar"));
        
        while(data!=9999){
            dia = data / 100;
            mes = data % 100;
            mes--;
            if(dia>ultdia[mes]){
                mes = (mes+1) % 12;
            }
            JOptionPane.showMessageDialog(null, "Signo: "+signo[mes]);
            data = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma data no formato ddmm ou 9999 para terminar"));
        }
    }
}
