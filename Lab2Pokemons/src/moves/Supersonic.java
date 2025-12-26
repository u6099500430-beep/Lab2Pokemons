package moves;

import ru.ifmo.se.pokemon.*;

public final class Supersonic extends StatusMove {
    public Supersonic() {
        super(Type.NORMAL, 0, 55);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        Effect.confuse(target);
    }
    @Override
    protected String describe() {
        return "Использует Supersonic!";
    }
}
