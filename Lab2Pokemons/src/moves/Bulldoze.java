package moves;

import ru.ifmo.se.pokemon.*;

public final class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        target.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "Использует Bulldoze";
    }
}
