package my_attacks;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC, 90, 100);
    }
    @Override
    protected String describe() {
        return "использует Молниеносный Удар";
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
