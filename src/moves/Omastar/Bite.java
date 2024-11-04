package moves.Omastar;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bite extends PhysicalMove {
    public Bite(double pow, double acc){
        super(Type.DARK, pow, acc);
    }


    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random()<=0.3){
            Effect.flinch(p);
        }}

    @Override
    protected String describe(){
        return "атакует Bite";
    }
}
