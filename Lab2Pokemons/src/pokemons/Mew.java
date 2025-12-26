package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Mew extends Pokemon {
    public Mew(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC);
        setStats(100, 100, 100, 100, 100, 100);
        setMove(new SludgeBomb(), new RockPolish(), new SteelWing(), new WildCharge());
    }
}
