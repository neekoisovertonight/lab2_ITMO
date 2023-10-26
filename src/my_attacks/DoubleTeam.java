package my_attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends SpecialMove {
    public DoubleTeam() {
        super(Type.NONE, 0, 100);
    }

    @Override
    public void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, +1);
    }

    @Override
    protected String describe() {
        return "теперь сложнее поймать";
    }
}
