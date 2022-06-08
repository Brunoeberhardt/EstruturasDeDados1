package ex4;

import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Fila Fila1 = new Fila();
        Stack<Integer> pilha = new Stack<>();
        Fila Fila2 = new Fila();
        
        Random rN = new Random();
        
        while(Fila1.tamanho() < 100){
            Fila1.push(rN.nextInt(100)); 
        }
        
        while(!Fila1.empty()){
            pilha.push(Fila1.pop());
            Fila2.push(pilha.pop());
        }
        
        int i=0;
        while(!Fila2.empty()){
            System.out.println(i + "--> "+ Fila2.pop());
            i++;
        }
    }
}