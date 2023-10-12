import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import my_pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Regigigas regigigas = new Regigigas("Meow", 1);
        b.addAlly(p1);
        b.addFoe(regigigas);
        b.go();
    }
}