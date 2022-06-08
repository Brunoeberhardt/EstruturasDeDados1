package ex6;

import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Stack<Integer> pilha = new Stack<>();
        Random rN = new Random();
        
        int i=0;
        
        while(i<1000){
            int numAleatorio = rN.nextInt();
            if(numAleatorio >= 0){
                fila.push(numAleatorio);
                i++;
            }
        }
        
        i=0;
        
        while(i<1000){
            int numAleatorio = rN.nextInt();
            if(numAleatorio < 0){
                fila.push(numAleatorio);
                i++;
            }
        }
        
        i=0;
        
        while(!fila.empty()){
            if(fila.peek() > 0){
                pilha.push(fila.pop());
            }
            else{
                System.out.println(i + "--> " + pilha.pop());
                i++;
                fila.pop();
            }
        }
    }

}