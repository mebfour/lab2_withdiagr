import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

//https://pokemondb.net/pokedex/lapras
//https://pokemondb.net/pokedex/omanyte
//https://pokemondb.net/pokedex/omastar - от omanyte
//https://pokemondb.net/pokedex/budew
//https://pokemondb.net/pokedex/roselia
//https://pokemondb.net/pokedex/roserade

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    
    public static void main(String[] args) {
        Battle b = new Battle();
        Omanyte omanyte = new Omanyte("Oma", 1);
        Budew budew = new Budew("Bu",1);
        Lapras lapras = new Lapras("zaputov", 1);
        Omastar omastar = new Omastar("Omast",1);
        Roserade roserade = new Roserade("roserade",1);
        Roselia roselia = new Roselia("rosel",1);


        b.addAlly(budew);
        b.addAlly(roserade);    //умеет спать
        b.addAlly(roselia);
        b.addFoe(lapras);       //атакует спящих
        b.addFoe(omanyte);
        b.addFoe(omastar);

        b.go();

        }

       




}

