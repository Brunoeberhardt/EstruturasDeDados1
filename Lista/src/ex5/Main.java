package ex5;

import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pilhaP = new Stack<>();
        Fila filaF = new Fila();
        
        Random rN = new Random();
        
        int i = 0;
        while(i<1000){
            int numAleatorio = rN.nextInt();
            if(!filaF.procura(numAleatorio)){
                filaF.push(numAleatorio);
            }
            else{
                pilhaP.push(1);
                }
            
            i++;
        }
        
        i=0;
        System.out.println("Conteudo fila F:");
        while(!filaF.empty()){
            System.out.println(i + "--> " + filaF.pop());
            i++;
        }
        
        i=0;
    }

}