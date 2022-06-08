package ex6;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    List<Integer> fila = new ArrayList<>();
    
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
    public boolean procurar(int valor){
        return fila.contains(valor);
    }
    
    public int peek(){
        return fila.get(0);
    }
}