package moves.Omastar;

import ru.ifmo.se.pokemon.*;

public class MudShot extends SpecialMove {
    public MudShot(double pow, double acc){
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.SPEED,-1);
        p.addEffect(e);
    }


    @Override
    protected String describe(){

        return "атакует Mud Shot";
    }
}
