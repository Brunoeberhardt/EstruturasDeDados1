package aula9;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        Fila F = new Fila();
        Lavados Flavados = new Lavados();
        Carro Resp = new Carro();
        
        Carro a1 = new Carro (); 
        
            a1.id = 01; 
            a1.modelo = "fusca";
            a1.cor = "vermelho";
            F.inserir(a1);
            Flavados.inserir(a1);
            
        Carro a2 = new Carro (); 
        
            a2.id = 02;
            a2.modelo = "celta";
            a2.cor = "preto";
            F.inserir(a2);
            Flavados.inserir(a2);
        
        Carro a3 = new Carro (); 
        
            a3.id = 03;
            a3.modelo = "gol";
            a3.cor = "vermelho";
            F.inserir(a3);
            Flavados.inserir(a3);
        
        Carro a4 = new Carro (); 
        
            a4.id = 04;
            a4.modelo = "celta";
            a4.cor = "preto";
            F.inserir(a4);
            Flavados.inserir(a4);
            
        Carro a5 = new Carro (); 
        
            a5.id = 05;
            a5.modelo = "207";
            a5.cor = "vermelho";
            F.inserir(a5);   
            Flavados.inserir(a5); 
            
        Carro a6 = new Carro (); 
        
            a6.id = 06;
            a6.modelo = "parati";
            a6.cor = "preto";
            F.inserir(a6);
            Flavados.inserir(a6);
            
        Carro a7 = new Carro (); 
        
            a7.id = 07;
            a7.modelo = "gol";
            a7.cor = "preto";
            F.inserir(a7);
            Flavados.inserir(a7);
            
        Carro a8 = new Carro (); 
        
            a8.id = 010;
            a8.modelo = "fusca";
            a8.cor = "branco";
            F.inserir(a8);
            Flavados.inserir(a8);
            
        Carro a9 = new Carro (); 
        
            a9.id = 011;
            a9.modelo = "strada";
            a9.cor = "vermelho";
            F.inserir(a9);
            Flavados.inserir(a9);
            
        Carro a10 = new Carro (); 
        
            a10.id = 012;
            a10.modelo = "voyage";
            a10.cor = "branco";
            F.inserir(a10);
            Flavados.inserir(a10);
            
        Carro a11 = new Carro (); 
        
            a11.id = 013;
            a11.modelo = "sandero";
            a11.cor = "preto";
            F.inserir(a11);
            Flavados.inserir(a11);
            
        Carro a12 = new Carro (); 
        
            a12.id = 014;
            a12.modelo = "206";
            a12.cor = "vermelho";
            F.inserir(a12);
            Flavados.inserir(a12);
        
        Carro a13 = new Carro (); 
        
            a13.id = 015;
            a13.modelo = "celta";
            a13.cor = "preto";
            F.inserir(a13);
            Flavados.inserir(a13);
            
        Carro a14 = new Carro (); 
        
            a14.id = 016;
            a14.modelo = "gol";
            a14.cor = "verde";
            F.inserir(a14);
            Flavados.inserir(a14);
            
        Carro a15 = new Carro (); 
        
            a15.id = 017;
            a15.modelo = "celta";
            a15.cor = "azul";
            F.inserir(a15);
            Flavados.inserir(a15);
        
        int contador = 0;
        for(int i = 0;i < 3;i++){
            System.out.println("Novo carro\n");

            contador+=1;
        }
        while(!F.fila_vazia()){
            Resp = (Carro) F.remover();
            System.out.println("Saindo carro: ");
            System.out.println("Id " + Resp.id);
            System.out.println("Modelo: " + Resp.modelo);
            System.out.println("Cor: " + Resp.cor);
            System.out.println("Carro limpo\n");

            if(contador != 15){

                System.out.println("Novo Carro\n");

                contador+=1;
            }
        }
        int op = Integer.parseInt(JOptionPane.showInputDialog("Fila de carros limpos:\nDigite 1"));
        if(op == 1){
            while(!Flavados.fila_vazia()){
                Resp = (Carro) Flavados.remover();
                
                System.out.println("Id : " + Resp.id);
                System.out.println("Modelo : " + Resp.modelo);
                System.out.println("Cor : " + Resp.cor);
            }
        }
    }
}