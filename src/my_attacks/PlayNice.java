package my_attacks;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends SpecialMove {
    public PlayNice() {
        super(Type.NONE, 0, 100);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "заставляет противника играть по-хорошему и ослабляет его атаку";
    }
}