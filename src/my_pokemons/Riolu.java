package my_pokemons;

import my_attacks.*;
import ru.ifmo.se.pokemon.*;

public class Riolu extends Pokemon {
    public Riolu(String name, int level) {
        super(name, level);
        setStats(40, 70, 40, 35, 40, 60);
        setType(Type.FIGHTING);
        setMove(new DoubleTeam(), new ShadowClaw(), new LowSweep());
    }
}