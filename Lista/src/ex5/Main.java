package ex5;

import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pilhaP = new Stack<>();
        Fila fila1 = new Fila();
        
        Random rN = new Random();
        
        int i = 0;
        while(i<1000){
            int numAleatorio = rN.nextInt();
            if(!fila1.procura(numAleatorio)){
                fila1.push(numAleatorio);
            }
            else{
                pilhaP.push(1);
                }
            
            i++;
        }
        
        i=0;
        System.out.println("Conteudo fila F:");
        while(!fila1.empty()){
            System.out.println(i + "--> " + fila1.pop());
            i++;
        }
        
        i=0;
    }

}