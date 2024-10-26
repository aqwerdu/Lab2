import Pokemons.*;
import ru.ifmo.se.pokemon.Pokemon;

public class Battle {
    public static void main(String[] args) {
        ru.ifmo.se.pokemon.Battle b = new ru.ifmo.se.pokemon.Battle();
        Pokemon p1 = new Dialga("Леди Баг", 40);
        Pokemon p2 = new Eevee("Супер Кот", 1);
        Pokemon p3 = new Jolteon("Рина Руш", 9);
        Pokemon p4 = new Igglybuff("Бражник", 1);
        Pokemon p5 = new Jigglypuff("Маюра", 5);
        Pokemon p6 = new Wigglytuff("Лайла", 1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addAlly(p1);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}