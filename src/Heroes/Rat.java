package Heroes;

import Exceptions.CantCatchRatInOtherLocationException;
import Exceptions.CantEatNotCaughtRatException;
import Exceptions.CantEscapeNotCaughtRatException;
import Exceptions.CantListenToItselfException;

public class Rat implements Movable {
    private Location location;
    private boolean alive = true;
    private RatCatcher catcher;

    public Rat(Location location) {
        this.location = location;
    }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }
    public boolean isAlive() { return alive; }
    public void kill() { alive = false;
        System.out.println("крыса умерла");}
    public RatCatcher getCatcher() { return catcher; }
    public void setCatcher(RatCatcher catcher) { this.catcher = catcher; }

    @Override
    public void moveTo(Location location) throws CantEatNotCaughtRatException {
        if (this.getCatcher() == null){
            this.location = location;
            location.addVisitor(this);
            System.out.println("крыса переместилась в " + location);}
        else{
            throw new CantEatNotCaughtRatException("Нельзя съесть непойманную кроысу");
        }
    }

    public void tryToEscape() throws CantEscapeNotCaughtRatException {
        if (this.getCatcher() != null) {
            throw new CantEscapeNotCaughtRatException("Нельзя сбежать непойманной крысе");
        }
        else{    if (this.getCatcher().getRatCatchingSkill() == RatCatchingSkill.BEGINNER) {
                int randomNum = (int) (Math.random() * 100) + 1; //число от 1 до 100
                if (randomNum > 90) {
                    this.setCatcher(null);//сбежал
                    this.getCatcher().removeRat(this);
                    System.out.println("крыса сбежала от " + this.getCatcher().getName());
                } else {
                    System.out.println("крыса не смогла сбежать");
                }
            } else if (this.getCatcher().getRatCatchingSkill() == RatCatchingSkill.ADVANCED) {
                int randomNum = (int) (Math.random() * 100) + 1; //число от 1 до 100
                if (randomNum > 75) {
                    this.setCatcher(null);//сбежал
                    this.getCatcher().removeRat(this);
                    System.out.println("крыса сбежала от " + this.getCatcher().getName());
                } else {
                    System.out.println("крысе не повезло, крыса не смогла сбежать");
                }
            } else if (this.getCatcher().getRatCatchingSkill() == RatCatchingSkill.EXPERT) {
                int randomNum = (int) (Math.random() * 100) + 1; //число от 1 до 100
                if (randomNum > 50) {
                    this.setCatcher(null);//сбежал
                    this.getCatcher().removeRat(this);
                    System.out.println("крыса сбежала от " + this.getCatcher().getName());
                } else {
                    System.out.println("крысолов слишком крут, крыса не смогла сбежать");
                }
            } else if (this.getCatcher().getRatCatchingSkill() == RatCatchingSkill.MASTER) {
                int randomNum = (int) (Math.random() * 100) + 1; //число от 1 до 100
                if (randomNum > 20) {
                    this.setCatcher(null);//сбежал
                    this.getCatcher().removeRat(this);
                    System.out.println("крыса сбежала от " + this.getCatcher().getName());
                } else {
                    System.out.println("крысолов слишком крут, крыса не смогла сбежать");
                }
            }
        }
    }

}