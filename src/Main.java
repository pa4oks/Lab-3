import Heroes.*;
import Exceptions.*;
import Heroes.Character;

public class Main {
    public static void main(String[] args) throws CantPlayWithNotCaughtRatException {
        Location location1 = new Location("Park", "Flowers");
        Location location2 = new Location("Square", "Road");
        Character Neznaika = new Character("Neznaika", location1);
        Character Minoga = new Character("Minoga", location1);
        Character Bigly = new Detective("Bigly", location2);
        Rat rat1 = new Rat(location1);
        Rat rat2 = new Rat(location2);
        Rat rat3 = new Rat(location2);
        Rat rat4 = new Rat(location1);
        Rat rat5 = new Rat(location1);
        RatCatcher Roland = new RatCatcher("Roland", location2, RatCatchingSkill.ADVANCED);
        RatEnjoyer Mimishka = new RatEnjoyer("Mimishka", location2);
        location2.getSmelling();
        //Roland.catchRat(rat1);
        Roland.catchRat(rat2);
        Roland.giveRat(Mimishka, rat2);
        location1.getSmelling();
        rat1.moveTo(location2);
        ((Detective) Bigly).inspectCharacter(Neznaika);
        try {
            Bigly.listenTo(Minoga);
        } catch (CantListenToItselfException e) {
            System.out.println(e.getMessage());
        }
        ((Detective) Bigly).inspectCharacter(Bigly);
        try {
            Bigly.listenTo(Bigly);
        } catch (CantListenToItselfException e) {
            System.out.println(e.getMessage());
        }
        try {
            Mimishka.playWithRat(rat2);
        } catch (CantPlayWithNotCaughtRatException e) {
            System.out.println(e.getMessage());
        }
        try {
            Mimishka.playWithRat(rat5);
        } catch (CantPlayWithNotCaughtRatException e) {
            System.out.println(e.getMessage());
        }
        try {
            rat2.tryToEscape();
        } catch (CantEscapeNotCaughtRatException e) {
            System.out.println(e.getMessage());
        }
        Roland.catchRat(rat1);
        Roland.eatRat(rat1);
    }
}
