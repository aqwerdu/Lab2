package Moves;

import ru.ifmo.se.pokemon.*;

final public class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect FireBlast = new Effect().chance(0.1).condition(Status.BURN);
        pokemon.addEffect(FireBlast);
    }

    @Override
    protected String describe() {
        return "атакует с помощью  Fire Blast, с вероятностью 10% накладывает на противника эффект воспламенения";
    }
}
