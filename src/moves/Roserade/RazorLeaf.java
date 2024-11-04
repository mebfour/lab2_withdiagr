package moves.Roserade;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf(double pow, double acc) {
        super(Type.GRASS, pow, acc);

    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1d/ 8d;
    }
    @Override
    protected String describe(){
        return "атакует Razor Leaf";
    }
}
