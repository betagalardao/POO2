package persobuilders.builders;

public static class PersonagemBuilder implements Builder {
    private PersoType type;
    private PersoWeapon weapon;
    private PersoHab hab;
    private int life;

    @Override
    public void setPersoType(PersoType type) {
        this.type = type;
    }

    @Override
    public void setPersoWeapon(PersoWeapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void setPersoHab(PersoHab hab) {
        this.hab = hab;
    }

    @Override
    public void setPersoLife(int life) {
        this.life = life;
    }

    public Personagem build() {
        return new Personagem(this);
    }
}