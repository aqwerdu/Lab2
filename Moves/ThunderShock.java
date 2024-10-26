package Moves;

import ru.ifmo.se.pokemon.*;

final public class ThunderShock extends SpecialMove {
    public ThunderShock() {
        super(Type.ELECTRIC, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect ThunderShock = new Effect().chance(0.1).condition(Status.PARALYZE);
        pokemon.addEffect(ThunderShock);
    }

    @Override
    protected String describe() {
        return "атакует с помощью ThunderShock, с вероятностью 10% парализует противника";
    }
}
