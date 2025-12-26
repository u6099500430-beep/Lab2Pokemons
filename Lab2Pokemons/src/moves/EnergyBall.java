package moves;

import ru.ifmo.se.pokemon.*;

public final class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon target){
        if(Math.random() <= 0.1) {
            target.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "Использует EnergyBall!";
    }
}
