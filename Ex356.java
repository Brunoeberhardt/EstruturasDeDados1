import javax.swing.JOptionPane;

public class Ex356 {

	public static void main(String[] args) {
		int i;
        String nome[] = new String[15];
        String situacao[] = new String[15];
        float pr1[] = new float[15];
        float pr2[] = new float[15];
        float media[] = new float[15];

        for(i=0;i<=14;i++){
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome: ");
            pr1[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota da pr1: "));
            pr2[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota da pr2: "));
            
            media[i] = (pr1[i]+pr2[i])/2;

            if(media[i]>=5){
                situacao[i] = "APROVADO";
            }else{
                situacao[i] = "REPROVADO";
            }
        }
        System.out.println("ALUNO\t5NOTA PR1\tNOTA PR2\tMEDIA\tSITUACAO\n");
        for(i=0;i<=14;i++){
            System.out.printf(nome[i]+"\t"+pr1[i]+" "+pr2[i]+" "+media[i]+" "+situacao[i]+"\n");
        }
	}

}