package torreDeHenoi;

import javax.swing.JOptionPane;

public class App {
    
	private static void hanoi(double qtdDiscos, char torreA, char torreB, char torreC){
        if(qtdDiscos > 0){
            hanoi(qtdDiscos-1, torreA, torreC, torreB);
            System.out.printf(" %s --> %s\n" , torreA, torreC);
            hanoi(qtdDiscos-1, torreB, torreA, torreC);
        }
    }
	public static void main(String[] args) throws Exception {
        
		double qtdDiscos = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de discos: "));
		long inicio = System.currentTimeMillis();
		double contador = Math.pow(2, qtdDiscos)-1;
        
        hanoi(qtdDiscos, '1', '2', '3');
        JOptionPane.showMessageDialog(null, "Quantidade de movimentos totais: " +  contador);
        
        long fim = System.currentTimeMillis();
        
        System.out.printf("Tempo de execucao do programa foi %.3f s%n" , (fim - inicio)/1000d);
    }
}