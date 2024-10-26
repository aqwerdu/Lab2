package Moves;

import ru.ifmo.se.pokemon.*;

final public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect Rest = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.restore();
        pokemon.addEffect(Rest);
    }

    @Override
    protected String describe() {
        return "атакует с помощью Rest, засыпает на 2 хода, восстанавливает все свои характеристики";
    }
}
