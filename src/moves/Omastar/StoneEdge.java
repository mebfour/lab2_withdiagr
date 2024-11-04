package moves.Omastar;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(double pow, double acc){
        super(Type.ROCK, pow, acc);

    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1d/ 8d;
    }
    @Override
    protected String describe(){

        return "атакует Stone Edge";
    }
}
