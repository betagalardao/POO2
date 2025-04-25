package jogo;

public class Guerreiro implements Personagem {
    private String nome;
    private int nivel;

    public Guerreiro(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    @Override
    public Personagem clonar() {
        return new Guerreiro(this.nome, this.nivel);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Guerreiro: " + this.nome + " Nível: " + this.nivel);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}