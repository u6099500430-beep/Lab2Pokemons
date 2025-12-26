package moves;

import ru.ifmo.se.pokemon.*;

public final class WildCharge extends PhysicalMove {
    public WildCharge() {
        super(Type.ELECTRIC, 90, 100);
    }
    @Override
    protected void applySelfDamage(Pokemon target, double damage) {
        target.setMod(Stat.HP, (int)(damage/4));
    }
    @Override
    protected String describe(){
        return "Использует WildCharge!";
    }
}
