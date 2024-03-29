package my_attacks;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class ThunderPunch extends PhysicalMove {
    public ThunderPunch() {
        super(Type.ELECTRIC, 75, 100);
    }

    @Override
    protected String describe() {
        return "использует Громовой Удар";
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if (randomNumber <= 9) {
            Effect.paralyze(pokemon);
        }
    }
}
