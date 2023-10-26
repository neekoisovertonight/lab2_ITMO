package my_pokemons;

import my_attacks.*;
import ru.ifmo.se.pokemon.*;

public class Raichu extends Pikachu {
    public Raichu(String name, int level) {
        super(name, level);
        setStats(60, 90, 55, 90, 80, 110);
        setType(Type.ELECTRIC);
        setMove(new Confide(), new Thunderbolt(), new PlayNice(), new Facade());
    }
}
