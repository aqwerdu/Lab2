package Pokemons;

import ru.ifmo.se.pokemon.Type;
import Moves.*;

final public class Wigglytuff extends Jigglypuff {
    public Wigglytuff(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(140, 70, 45, 85, 50, 45);
        this.setMove(new ShadowBall(), new FireBlast(), new Pound(), new DoubleSlap());
    }
}