package pokemons;

import moves.*;

public class Cofagrigus extends Yamask {
    public Cofagrigus(String name, int level) {
        super(name, level);
        setStats(58, 50, 145, 95, 105, 30);
        addMove(new ScaryFace());
    }
}
