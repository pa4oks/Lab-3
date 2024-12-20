package Heroes;

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
    public void kill() { alive = false; }
    public RatCatcher getCatcher() { return catcher; }
    public void setCatcher(RatCatcher catcher) { this.catcher = catcher; }

    @Override
    public void moveTo(Location location) {
        this.location = location;
        location.addVisitor(this);
    }

    public void tryToEscape() {
        if (this.getCatcher().getRatCatchingSkill() == RatCatchingSkill.BEGINNER){
            int randomNum = (int)(Math.random() * 100) + 1; //число от 1 до 100
            if(randomNum > 90){
                this.setCatcher(null);//сбежал
                this.getCatcher().removeRat(this);
                System.out.println("крыса сбежала от " + this.getCatcher().getName());
            }
        }
        else if (this.getCatcher().getRatCatchingSkill() == RatCatchingSkill.ADVANCED){
            int randomNum = (int)(Math.random() * 100) + 1; //число от 1 до 100
            if(randomNum > 75){
                this.setCatcher(null);//сбежал
                this.getCatcher().removeRat(this);
                System.out.println("крыса сбежала от " + this.getCatcher().getName());
            }
        }
        else if (this.getCatcher().getRatCatchingSkill() == RatCatchingSkill.EXPERT){
            int randomNum = (int)(Math.random() * 100) + 1; //число от 1 до 100
            if(randomNum > 50){
                this.setCatcher(null);//сбежал
                this.getCatcher().removeRat(this);
                System.out.println("крыса сбежала от " + this.getCatcher().getName());
            }
        }
        else if (this.getCatcher().getRatCatchingSkill() == RatCatchingSkill.MASTER){
            int randomNum = (int)(Math.random() * 100) + 1; //число от 1 до 100
            if(randomNum > 20){
                this.setCatcher(null);//сбежал
                this.getCatcher().removeRat(this);
                System.out.println("крыса сбежала от " + this.getCatcher().getName());
            }
        }
    }

}