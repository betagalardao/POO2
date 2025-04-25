package persobuilders;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Personagem guerreiro = director.criarPersonagemGuerreiro();
        Personagem mago = director.criarPersonagemMago();
        Personagem arqueiro = director.criarPersonagemArqueiro();

        System.out.println(guerreiro);
        System.out.println(mago);
        System.out.println(arqueiro);
    }
}
