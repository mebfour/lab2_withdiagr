package moves.Lapras;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends PhysicalMove {
    public DreamEater(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }



/*
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        if (def.getCondition() == Status.SLEEP){
            super.applySelfEffects(att);
            att.setMod(Stat.HP,(int)(att.getStat(Stat.HP)*0.5));
            return super.calcBaseDamage(att, def);
        }
        else {
            return 0;

        }

    }
*/

    double dealedDamage;

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        dealedDamage = 0;
        if(def.getCondition() == Status.SLEEP){
            def.setMod(Stat.HP, (int) Math.round(damage));
            dealedDamage = Math.round(damage);
        }

    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        att.setMod(Stat.HP, (int) (-0.5* dealedDamage));
    }


    @Override
    protected String describe(){

        return "атакует Dream Eater" ;

    }
}
