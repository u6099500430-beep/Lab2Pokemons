package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Trapinch extends Pokemon {
    public Trapinch(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(45, 100, 45, 45, 45, 10);
        setMove(new Bulldoze(), new RockSlide());
    }
}
