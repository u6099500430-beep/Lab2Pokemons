package moves;

import ru.ifmo.se.pokemon.*;

public final class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.POISON, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        if(Math.random() <= 0.3) {
            Effect.poison(target);
        }
    }
    @Override
    protected String describe() {
        return "Использует SludgeBomb!";
    }
}
