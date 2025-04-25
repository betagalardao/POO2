package persobuilders.director;

package persobuilders.builders;

public class Director {

    public Personagem criarPersonagemGuerreiro() {
        Personagem.PersonagemBuilder builder = new Personagem.PersonagemBuilder();
        builder.setPersoType(PersoType.GUERREIRO);
        builder.setPersoWeapon(PersoWeapon.ESPADA);
        builder.setPersoHab(PersoHab.GOLPE_DUPLO);
        builder.setPersoLife(100);
        return builder.build();
    }

    public Personagem criarPersonagemMago() {
        Personagem.PersonagemBuilder builder = new Personagem.PersonagemBuilder();
        builder.setPersoType(PersoType.MAGO);
        builder.setPersoWeapon(PersoWeapon.CAJADO);
        builder.setPersoHab(PersoHab.BOLA_DE_FOGO);
        builder.setPersoLife(80);
        return builder.build();
    }

    public Personagem criarPersonagemArqueiro() {
        Personagem.PersonagemBuilder builder = new Personagem.PersonagemBuilder();
        builder.setPersoType(PersoType.ARQUEIRO);
        builder.setPersoWeapon(PersoWeapon.ARCO);
        builder.setPersoHab(PersoHab.INVISIBILIDADE);
        builder.setPersoLife(90);
        return builder.build();
    }
}