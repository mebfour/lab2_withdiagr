package pokemons;

import moves.Lapras.Blizzard;
import moves.Omastar.Bite;
import moves.Omastar.MudShot;
import moves.Omastar.StoneEdge;
import ru.ifmo.se.pokemon.Type;

public class Omastar extends Omanyte {         //  наследуем от базового класса Покемон
    public Omastar(String name, int lvl) {     //пишем конструктор
        super(name, lvl);
        super.setType(Type.ROCK, Type.WATER);
        super.setStats(70,60,125,115,70,55);

        MudShot mudShot = new MudShot(55, 95);
        Bite bite = new Bite(60,100);
        Blizzard blizzard = new Blizzard(110,70);
        StoneEdge stoneEdge = new StoneEdge(100, 80);
        setMove(blizzard, bite, mudShot, stoneEdge);


    }



}
