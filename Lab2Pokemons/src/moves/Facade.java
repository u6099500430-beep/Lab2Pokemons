package moves;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        Status c = att.getCondition();
        double damage = super.calcBaseDamage(att, def);
        if (c == Status.BURN || c == Status.PARALYZE || c == Status.POISON) {
            return damage * 2;
        } else {
            return damage;
        }
    }
    @Override
    protected String describe() {
        return "Использует Facade!";
    }
}
