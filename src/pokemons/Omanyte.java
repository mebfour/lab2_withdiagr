package pokemons;

import moves.Lapras.Blizzard;
import moves.Omastar.Bite;
import moves.Omastar.MudShot;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Omanyte extends Pokemon {         //  наследуем от базового класса Покемон
    public Omanyte(String name, int lvl) {     //пишем конструктор
        super(name, lvl);
        super.setType(Type.ROCK, Type.WATER);
        super.setStats(35,40,100,90,55,35);

        MudShot mudShot = new MudShot(55, 95);
        Bite bite = new Bite(60,100);
        Blizzard blizzard = new Blizzard(110,70);
        setMove(blizzard, mudShot, bite);
    }



}
