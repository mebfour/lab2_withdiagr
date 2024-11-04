package pokemons;

import moves.Roserade.Confide;
import moves.Roserade.DoubleTeam;
import moves.Roserade.RazorLeaf;
import moves.Roserade.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roserade extends Roselia {         //  наследуем от базового класса Покемон
    public Roserade(String name, int lvl) {     //пишем конструктор
        super(name, lvl);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(60,70,65,125,105,90);

        Confide confide = new Confide();
        DoubleTeam doubleTeam = new DoubleTeam();
        RazorLeaf razorLeaf = new RazorLeaf(55,95);
        Rest rest = new Rest();
        setMove(confide, doubleTeam, razorLeaf, rest);
    }



}
