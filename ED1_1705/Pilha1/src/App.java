import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		int topo = 0;
	       
	    	Criptografia p1 = new Criptografia();
	       		
	    	topo = (int) p1.push(topo, "UM");
	    	topo = (int) p1.push(topo, "CIENTISTA");
	    	topo = (int) p1.push(topo, "DA");
	    	topo = (int) p1.push(topo, "COMPUTAÇAO");
	    	topo = (int) p1.push(topo, "DEVE");
	    	topo = (int) p1.push(topo, "RESOLVER");
	    	topo = (int) p1.push(topo, "OS");
	    	topo = (int) p1.push(topo, "PROBLEMAS");
	    	topo = (int) p1.push(topo, "LOGICAMENTE");

	    	p1.imprimir(10);
	        	
//1) UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE

//2) ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG
	       
	        
	}
}
