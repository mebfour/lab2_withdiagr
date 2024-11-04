package pokemons;

import moves.Roserade.Confide;
import moves.Roserade.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon {
    public Budew(String name, int lvl){
        super(name, lvl);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(40,30,35,50,70,55);

        Confide confide = new Confide();
        DoubleTeam doubleTeam = new DoubleTeam();
        setMove(confide, doubleTeam);
    }
}
