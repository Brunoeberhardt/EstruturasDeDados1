package ex2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> pilha1 = new Stack<String>();
        Stack<String> pilha2 = new Stack<String>();
        Stack<String> pilha3 = new Stack<String>();
        
        Scanner sc = new Scanner(System.in);
        
        pilha1.push("item1");
        pilha1.push("item2");
        pilha1.push("item3");
        
        while(!pilha1.empty()){
            pilha2.push(pilha1.peek());
            pilha3.push(pilha1.pop());
        }
        
        System.out.println("Digite o elemento para remocao: ");
        String chaveC = sc.nextLine();
        
        System.out.println("\nPilha original: ");
        while(!pilha2.empty()){
            System.out.print(pilha2.pop() + ' ');
        }
       
        System.out.println("\n\nPilha com remocao: ");
        while(!pilha3.empty()){
            if(pilha3.peek().equals(chaveC)){
                pilha3.pop();
            }else{
                System.out.print(pilha3.pop() + ' ');
            }
        }
    }
}