package Moves;

import ru.ifmo.se.pokemon.*;

final public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect Thunderbolt = new Effect().chance(0.1).condition(Status.PARALYZE);
        pokemon.addEffect(Thunderbolt);
    }

    @Override
    protected String describe() {
        return "атакует с помощью Thunderbolt, с вероятность 10% парализует противника";
    }
}
