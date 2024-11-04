package pokemons;
import moves.Lapras.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Lapras extends Pokemon {         //  наследуем от базового класса Покемон
    public Lapras(String name, int lvl) {     //пишем конструктор
        super(name, lvl);
        setType(Type.WATER, Type.ICE);
        setStats(130,85,80,85,95,60);

        Thunderbolt thunderbolt = new Thunderbolt(90,100);
        Blizzard blizzard = new Blizzard(110, 70);
        Refresh refresh = new Refresh();
        DreamEater dreamEater = new DreamEater(100, 100);
        setMove(dreamEater , thunderbolt , blizzard, refresh);

    }



}
