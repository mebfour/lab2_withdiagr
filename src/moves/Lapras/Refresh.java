package moves.Lapras;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Refresh extends StatusMove {
    public Refresh(){    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.burn(p);
        Effect.paralyze(p);
        Effect.poison(p);

    }

    @Override
    protected String describe(){
        return "атакует Refresh";
    }
}
