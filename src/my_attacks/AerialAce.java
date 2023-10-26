package my_attacks;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected String describe() {
        return "использует Воздушный Козырь";
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().turns(2).stat(Stat.ACCURACY, 0).stat(Stat.EVASION, 0);
        pokemon.addEffect(e);
    }

}
