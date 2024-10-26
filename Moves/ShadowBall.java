package Moves;

import ru.ifmo.se.pokemon.*;

final public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect ShadowBall = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(ShadowBall);
    }

    @Override
    protected String describe() {
        return "атакует с помощью Shadow Ball, с вероятностью 20% уменьшает Special Defense противника на 1";
    }
}
