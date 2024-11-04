package moves;

import ru.ifmo.se.pokemon.*;


public class BaseMove extends PhysicalMove{

    public BaseMove(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.HP, 50);
        p.addEffect(e);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1d/ 8d;
    }
    @Override
    protected String describe(){

        return "атакует Base Move";
    }
}
