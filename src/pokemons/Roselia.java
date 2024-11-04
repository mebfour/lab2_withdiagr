package pokemons;

import moves.Roserade.Confide;
import moves.Roserade.DoubleTeam;
import moves.Roserade.RazorLeaf;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Budew {         //  наследуем от базового класса Покемон
    public Roselia(String name, int lvl) {     //пишем конструктор
        super(name, lvl);
        super.setType(Type.GRASS, Type.POISON);
        super.setStats(50,60,45,100,80,65);

        Confide confide = new Confide();
        DoubleTeam doubleTeam = new DoubleTeam();
        RazorLeaf razorLeaf = new RazorLeaf(55,95);
        setMove(confide, doubleTeam, razorLeaf);
    }



}
