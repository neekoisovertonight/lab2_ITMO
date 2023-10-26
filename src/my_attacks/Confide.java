package my_attacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends SpecialMove {
    public Confide() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "понижает уровень специальной атаки противника";
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
    }
}
