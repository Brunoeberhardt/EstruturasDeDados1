package ex7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Random rN = new Random();
        Fila filaInvertida = new Fila();
        
        for(int i=0; i<20; i++){
            fila.push(rN.nextInt());
        }
        
        System.out.println("Fila original:");
        while(!fila.empty()){
            filaInvertida.push(fila.peek());
            System.out.println(fila.pop());
        }
        
        filaInvertida.inverter();
        
        System.out.println("\nFila Invertida:");
        while(!filaInvertida.empty()){
            System.out.println(filaInvertida.pop());
        }
    }
}