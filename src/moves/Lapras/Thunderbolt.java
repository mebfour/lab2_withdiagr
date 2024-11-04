package moves.Lapras;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

import ru.ifmo.se.pokemon.*;
public class Thunderbolt extends SpecialMove {
    public Thunderbolt(double power, double accuracy){
        super(Type.ELECTRIC, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random()<=0.1){
            Effect.paralyze(p);
        }
    }

    @Override       //  переопред метод describe
    protected String describe(){
        //  class.pokemon.action. c п-ю split делим действия на отдельные кусочки, выбираем последнюю, подписывая does
        return "атакует Thunderbolt";
    }
}
