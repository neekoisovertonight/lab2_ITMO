package my_pokemons;

import my_attacks.*;
import ru.ifmo.se.pokemon.*;

public class Lucario extends Riolu {
    public Lucario(String name, int level) {
        super(name, level);
        setStats(70, 110, 70, 115, 70, 90);
        setType(Type.FIGHTING, Type.STEEL);
        setMove(new DoubleTeam(), new ShadowClaw(), new LowSweep());
    }
}