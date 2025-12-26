import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Mew mew = new Mew("Mew", 1);

        Yamask yamask = new Yamask("Yamask", 1);
        Cofagrigus cofagrigus = new Cofagrigus("Cofagrigus", 1);

        Trapinch trapinch = new Trapinch("Trapinch", 1);
        Vibrava vibrava = new Vibrava("Vibrava", 1);
        Flygon flygon = new Flygon("Flygon", 1);

        b.addAlly(mew);
        b.addAlly(yamask);
        b.addAlly(cofagrigus);

        b.addFoe(trapinch);
        b.addFoe(vibrava);
        b.addFoe(flygon);

        b.go();
    }
}
