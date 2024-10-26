package Moves;

import ru.ifmo.se.pokemon.*;

final public class AncientPower extends SpecialMove {
    public AncientPower() {
        super(Type.ROCK, 60, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect AncientPower = new Effect().chance(0.1).stat(Stat.ACCURACY, 1).stat(Stat.ATTACK, 1).stat(Stat.DEFENSE, 1).stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPEED, 1);
        pokemon.addEffect(AncientPower);
    }

    @Override
    protected String describe() {
        return "аттакует с помощью Ancient Power, с вероятностью 10% увеличит все свои характеристики на 1";
    }
}
