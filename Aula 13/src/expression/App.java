package expression;

import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        PilhaDinamica parenteses = new PilhaDinamica();
        PilhaDinamica colchetes = new PilhaDinamica();
        PilhaDinamica chaves = new PilhaDinamica();
        
        boolean op = true;

        System.out.println("Digite a expressão:");
        String palavra = scan.next();
        
        String vetor[] = palavra.split("");
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals("(")) {
                parenteses.push(vetor[i]);
            }
            if (vetor[i].equals(")")) {
                if (parenteses.isEmpyt()) {
                    op = false;
                    break;
                } else
                    parenteses.pop();
            }

            if (vetor[i].equals("[")) {
                colchetes.push(vetor[i]);
            }
            if (vetor[i].equals("]")) {
                if (colchetes.isEmpyt()) {
                    op = false;
                    break;
                } else
                    colchetes.pop();
            }

            if (vetor[i].equals("{")) {
                chaves.push(vetor[i]);
            }
            if (vetor[i].equals("}")) {
                if (chaves.isEmpyt()) {
                    op = false; 
                    break;
                } else
                    chaves.pop();
            }
        }
        if (chaves.isEmpyt()) {
            if (parenteses.isEmpyt() && colchetes.isEmpyt() && chaves.isEmpyt() && op) {
                System.out.println("A expressão se encontra correta");
            } else {
                System.out.println("A expressão não se encontra correta");
            }
        }
    }
}