package moves;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon target) {
        double max_hpbar = target.getStat(Stat.HP);
        double current_hpbar = target.getHP();
        double heal = max_hpbar - current_hpbar;
        target.setMod(Stat.HP, (int) heal);
        Effect.sleep(target);
    }
    @Override
    protected String describe() {
        return "Использует Rest!";
    }
}
