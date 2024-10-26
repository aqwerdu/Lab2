package Pokemons;

import ru.ifmo.se.pokemon.Type;
import Moves.*;

public class Jigglypuff extends Igglybuff {
    public Jigglypuff(String name, int level) {
        super(name, level);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(115, 45, 20, 45, 25, 20);
        this.setMove(new ShadowBall(), new FireBlast(), new Pound());
    }
}
