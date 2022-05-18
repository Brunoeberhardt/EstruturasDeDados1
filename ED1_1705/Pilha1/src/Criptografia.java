import javax.swing.JOptionPane;

public class Criptografia {
		
	String[] pilha = new String[10];
	int topopilha = -1;
	
	void imprimir(int topo){
		 for(int i=1; i<topo; i++){
		 System.out.println("Valor na pilha: " +this.pilha[i]);
		 }
	}
	
	Object push(int topo, String palavra){
		this.topopilha = topo;
		this.topopilha++;
		if(this.topopilha < 0){
		this.topopilha = 0;
		}
		if(this.topopilha > 10){
			JOptionPane.showMessageDialog(null, "Estouro de pilha, erro: -999");
			return(this.topopilha--);
		}else{
		this.pilha[this.topopilha]=palavra;
		System.out.println("Inserindo o elemento: "+palavra);
		return(this.topopilha);
		}
	}
}
//1) UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE

//2) ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG

