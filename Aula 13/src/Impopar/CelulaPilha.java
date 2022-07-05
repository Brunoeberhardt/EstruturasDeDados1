package Impopar;

public class CelulaPilha {

    private int nome;
    private CelulaPilha anterior;

    public int getNome() {
        return this.nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public CelulaPilha getAnterior() {
        return this.anterior;
    }

    public void setAnterior(CelulaPilha anterior) {
        this.anterior = anterior;
    }

    public void setDado(String nome2) {
    }

    public int getDado() {
        return 0;
    }

}