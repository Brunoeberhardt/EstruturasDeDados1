package ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Fila {
    private List<Integer> fila = new ArrayList<>();
    private Stack<Integer> inversa = new Stack<>();
    
    public void push(int numero){
        fila.add(numero);
    }
    
    public int pop(){
        int removido = fila.get(0);
        fila.remove(0);
        return removido;
    }
    
    public boolean empty(){
        return fila.isEmpty();
    }
    
    public int tamanho(){
        return fila.size();
    }
    public boolean procura(int valor){
        return fila.contains(valor);
    }
    
    public int peek(){
        return fila.get(0);
    }
    
    public void inverter(){
        while(!fila.isEmpty()){
            inversa.push(fila.get(0));
            fila.remove(0);
        }
        while(!inversa.empty()){
            fila.add(inversa.pop());
        }
    }
}