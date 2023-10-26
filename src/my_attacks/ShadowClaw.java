package my_attacks;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw() {
        super(Type.GHOST, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.confuse();
        pokemon.setMod(Stat.ATTACK,+2);
    }

    @Override
    protected String describe() {
        return "использует Коготь Тьмы и заставляет противника растеряться";
    }

}
