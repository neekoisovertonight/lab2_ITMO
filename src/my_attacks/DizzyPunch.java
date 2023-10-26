package my_attacks;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class DizzyPunch extends PhysicalMove {
    public DizzyPunch() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected String describe() {
        return "использует Головокружительный Удар";
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if (randomNumber <= 19) {
            Effect.confuse(pokemon);
        }
    }
}