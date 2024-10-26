package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Moves.*;

final public class Dialga extends Pokemon {
    public Dialga(String name, int level) {
        super(name, level);
        this.setType(Type.STEEL, Type.DRAGON);
        this.setStats(100, 120, 120, 150, 100, 90);
        this.setMove(new DragonClaw(), new Thunderbolt(), new AncientPower(), new Thunder());
    }
}
