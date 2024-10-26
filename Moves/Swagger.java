package Moves;

import ru.ifmo.se.pokemon.*;

final public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect Swagger = new Effect().stat(Stat.ATTACK, 2);
        pokemon.addEffect(Swagger);
        pokemon.confuse();
    }

    @Override
    protected String describe() {
        return "атакует с помощью Swagger, вызывает у противника растерянность и увиличивает Attack противника на 2";
    }
}
