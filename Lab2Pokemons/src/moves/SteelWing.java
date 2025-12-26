package moves;

import ru.ifmo.se.pokemon.*;

public final class SteelWing extends PhysicalMove {
    public SteelWing() {
        super(Type.STEEL, 70, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon target) {
        if(Math.random() <= 0.1){
            target.setMod(Stat.DEFENSE, 1);
        }
    }
    @Override
    protected String describe() {
        return "Использует SteelWing!";
    }
}
