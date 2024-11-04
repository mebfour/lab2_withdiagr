package moves.Lapras;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {
    public Blizzard(double pow, double acc){
        super(Type.ICE, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){

        super.applyOppEffects(p);
        if (Math.random()<0.1){
            Effect.freeze(p);
        }

    }

    @Override       //  переопред метод describe
    protected String describe(){

        return "атакует Blizzard";
    }
}
