package Moves;

import ru.ifmo.se.pokemon.*;

final public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect Thunder = new Effect().chance(0.3).condition(Status.PARALYZE);
        pokemon.addEffect(Thunder);
    }

    @Override
    protected String describe() {
        return "атакует с помощью Thunder, c вероятностью 30% парализует противника";
    }
}
