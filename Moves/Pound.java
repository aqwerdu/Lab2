package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

final public class Pound extends PhysicalMove {
    public Pound() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "атакует с помощью Pound";
    }
}
