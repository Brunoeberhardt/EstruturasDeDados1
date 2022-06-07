package ex8;

import java.util.Stack;

public class TestaPilha {
    Stack<Integer> n = new Stack<>();
    Stack<Integer> p = new Stack<>();
    
    public void verifica(int valor){
        if(valor>0){
            insereP(valor);
        }
        else if(valor<0){
            insereN(valor);
        }
        else if(valor==0){
        	retiraEImprime();
        }
    }
    
    private void insereP(int valor){
        p.push(valor);
    }
    
    private void insereN(int valor){
        n.push(valor);
    }
    
    private void retiraEImprime(){
        System.out.println("Conteudo pilha p: " + p.pop() + "\nConteudo pilha n: " + n.pop());
    }
    
}