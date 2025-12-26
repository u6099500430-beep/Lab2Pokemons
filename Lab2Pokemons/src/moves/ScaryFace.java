package moves;

import ru.ifmo.se.pokemon.*;

public final class ScaryFace extends StatusMove {
    public ScaryFace() {
        super(Type.NORMAL, 0, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        target.setMod(Stat.SPEED, -2);
    }
    @Override
    protected String describe() {
        return "Использует ScaryFace!";
    }
}
