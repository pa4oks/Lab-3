package Heroes;

import Exceptions.CantCatchRatInOtherLocationException;
import Exceptions.CantPlayWithNotCaughtRatException;

import java.util.ArrayList;
import java.util.List;
//import java.Emotion;

public class RatEnjoyer extends Dog {
    String name;
    Location location;
    Emotion emotion;

    public RatEnjoyer(String name, Heroes.Location location) {
        super(name, location);
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    public void playWithRat(Rat rat) throws CantPlayWithNotCaughtRatException {
        if (rat.getCatcher() == null) {
            throw new CantPlayWithNotCaughtRatException("Нельзя играть с непойманной крысой");
        } else {
            if (rat.isAlive()) {
                setEmotion(new Emotion("Happy", 0.8f));
                System.out.println(this.getName() + " счастлив");
            } else {
                setEmotion(new Emotion("Sad", 0.2f));
                System.out.println(this.getName() + " грустит");
            }
        }
    }
}

    /*private void setEmotion(Emotion emotion) {
            this.emotion = emotion;
    }*/


    /*@Override
    public void listenTo(Character character) {
        System.out.println(this.getName() + "прислушивется к" + character.getName());
    }*/

    /*static class Location {
        private String name;
        private String smelling;
        private List<Movable> currentVisitors = new ArrayList<>();

        public Location(String name, String smelling) {
            this.name = name;
            this.smelling = smelling;
        }

        public boolean hasRats() {
            for (Movable visitor : currentVisitors) {
                if (visitor instanceof Rat) {
                    return true; // If at least one Rat is found, return true
                }
            }
            return false; // If no Rats are found, return false
        }

        public String getName() { return name; }

        public String getSmelling() {
            if (this.hasRats()){smelling = "ммм пахнет крысами!";}
            return smelling;
        }

        public void setSmelling(String smelling) { this.smelling = smelling; }
        public void addVisitor(Movable movable) { currentVisitors.add(movable); }
        //public void removeVisitor(Movable movable) { currentVisitors.remove(movable); }
        public List<Movable> getCurrentVisitors() { return currentVisitors; }
    }*/

    // Record for Emotion