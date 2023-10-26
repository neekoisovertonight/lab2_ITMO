package my_attacks;

import ru.ifmo.se.pokemon.*;

public class RockPolish extends SpecialMove {
    public RockPolish() {
        super(Type.NONE, 0, 100);
    }

    @Override
    protected String describe() {
        return "ускоряется";
    }

    @Override
    public void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, +2);
    }
}
