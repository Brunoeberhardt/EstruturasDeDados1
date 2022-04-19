import javax.swing.JOptionPane;

public class Ex435 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[][] = new int[5][5];
		int c = 0;
		for (int l=0;l<5;l++) {
			for(c=0;c<5;c++) {
				n[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite elemento de N"));
			}
		}
		 c = Integer.parseInt(JOptionPane.showInputDialog("Digite numero da coluna(1-5) ou -999 para acabar: "));
		 
		 while(c != 999) {
			 while(c < 1 || c > 5);{
				 c = Integer.parseInt(JOptionPane.showInputDialog("Digite numero da coluna entre 1 - 5:"));
			 }
			 JOptionPane.showMessageDialog(null, "Coluna" + c + 1 + "\n");
			 for(int l=0;l<5;c++) {
				 JOptionPane.showMessageDialog(null, n[l][c] + "\n");
				 c = Integer.parseInt(JOptionPane.showInputDialog("Digite numero da coluna 1 - 5 ou -999 para acabar: "));
			 }
		 }
	}

}
