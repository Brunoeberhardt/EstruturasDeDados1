package ex4;

import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Fila F1 = new Fila();
        Stack<Integer> pilha = new Stack<>();
        Fila F2 = new Fila();
        
        Random rN = new Random();
        
        while(F1.tamanho() < 100){
            F1.push(rN.nextInt(100)); 
        }
        
        while(!F1.empty()){
            pilha.push(F1.pop());
            F2.push(pilha.pop());
        }
        
        int i=0;
        while(!F2.empty()){
            System.out.println(i + "--> "+ F2.pop());
            i++;
        }
    }
}