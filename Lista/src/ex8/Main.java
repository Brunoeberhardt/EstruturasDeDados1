package ex8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TestaPilha pilha = new TestaPilha();
        Random rN = new Random();
        
        for(int i=0; i<1000; i++){
            pilha.verifica(rN.nextInt(-100, 100));
        }
    }

}