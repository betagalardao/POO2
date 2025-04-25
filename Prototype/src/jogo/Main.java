package jogo;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro1 = new Guerreiro("Thor", 100);
        Guerreiro guerreiro2 = (Guerreiro) guerreiro1.clonar();
        guerreiro2.setNome("Loki");
        guerreiro2.setNivel(90);

        guerreiro1.exibirDetalhes();
        guerreiro2.exibirDetalhes();

        Mago mago1 = new Mago("Merlin", 10);
        Mago mago2 = (Mago) mago1.clonar();
        mago2.setNome ("Dumbledore");
        mago2.setNivel(89);

        mago1.exibirDetalhes();
        mago2.exibirDetalhes();

        Arqueiro arqueiro1 = new Arqueiro("Robbin", 60);
        Arqueiro arqueiro2 = (Arqueiro) arqueiro1.clonar();
        arqueiro2.setNome("Nicollau");
        arqueiro2.setNivel(75);

        arqueiro1.exibirDetalhes();
        arqueiro2.exibirDetalhes();
    }
}