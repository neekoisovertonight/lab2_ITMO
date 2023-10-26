import ru.ifmo.se.pokemon.*;
import my_pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Lucario p1 = new Lucario("Лукарио", 2);
        Pichu p2 = new Pichu("Пичу", 1);
        ;
        Pikachu p3 = new Pikachu("Пикачу", 2);
        Raichu p4 = new Raichu("Райчу", 3);
        ;
        Regigigas p6 = new Regigigas("Реджигигас", 1);
        Riolu p5 = new Riolu("Риолу", 1);

        b.addAlly(p2);
        b.addAlly(p3);
        b.addAlly(p4);
        b.addFoe(p1);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}