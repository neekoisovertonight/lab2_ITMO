package my_pokemons;

import my_attacks.*;
import ru.ifmo.se.pokemon.*;

public class Pikachu extends Pichu {
    public Pikachu(String name, int level) {
        super(name, level);
        setStats(35, 55, 40, 50, 50, 90);
        setType(Type.ELECTRIC);
        setMove(new Confide(), new Thunderbolt(), new PlayNice());
    }
}
