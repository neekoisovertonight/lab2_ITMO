package my_attacks;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep() {
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    protected String describe() {
        return "наносит урон и замедляет противника";
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, -1);
    }
}