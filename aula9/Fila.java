package aula9;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    List <Object> obj = new ArrayList<>(); 
    
    void inserir(Object A){
        this.obj.add(A);
    }
    Object remover(){
        return this.obj.remove(0);
    }
    
    boolean fila_vazia(){
        return(this.obj.isEmpty());
    }
}
