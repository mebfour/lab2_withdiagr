package moves.Roserade;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){}

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().turns(2);
        Effect.sleep(p);
        p.setMod(Stat.HP, (int) (p.getStat(Stat.HP)));
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "атакует Rest";
    }
}
