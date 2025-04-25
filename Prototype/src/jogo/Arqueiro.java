package jogo;

public class Arqueiro implements Personagem {
    private String nome;
    private int nivel;

    public Arqueiro(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    @Override
    public Personagem clonar() {
        return new Arqueiro(this.nome, this.nivel);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Arqueiro: " + this.nome + " Nível: " + this.nivel);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}