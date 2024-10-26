package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

final public class DoubleSlap extends PhysicalMove {
    static int hit = (int) (2 + Math.random() * (5 - 2 + 1));

    public DoubleSlap() {
        super(Type.NORMAL, 15, 85, 0, hit);
    }

    @Override
    protected String describe() {
        return "атакует с помощью DoubleSlap, может атаковать от 2 до 5 раз за ход";
    }
}
