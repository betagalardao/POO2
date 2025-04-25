package persobuilders.personagem;

package persobuilders.builders;

public class Personagem {
    private PersoType type;
    private PersoWeapon weapon;
    private PersoHab hab;
    private int life;

    private Personagem(PersonagemBuilder builder) {
        this.type = builder.type;
        this.weapon = builder.weapon;
        this.hab = builder.hab;
        this.life = builder.life;
    }

    public PersoType getType() {
        return type;
    }

    public PersoWeapon getWeapon() {
        return weapon;
    }

    public PersoHab getHab() {
        return hab;
    }

    public int getLife() {
        return life;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "type=" + type +
                ", weapon=" + weapon +
                ", hab=" + hab +
                ", life=" + life +
                '}';
    }
}
