package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

final public class DragonClaw extends PhysicalMove {
    public DragonClaw() {
        super(Type.DRAGON, 80, 100);
    }

    @Override
    protected String describe() {
        return "атакует с помощью Dragon Claw";
    }
}
