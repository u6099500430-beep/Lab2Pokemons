package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Yamask extends Pokemon {
    public Yamask(String name, int level) {
        super(name, level);
        setType(Type.GHOST);
        setStats(38, 30, 85, 55, 65, 30);
        setMove(new Rest(), new EnergyBall(), new Facade());
    }
}
