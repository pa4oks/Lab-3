package Heroes;

public class RatCatcher extends Dog {
    private RatCatchingSkill ratCatchingSkill;

    public RatCatcher(String name, Location location, RatCatchingSkill skill) {
        super(name, location);
        this.ratCatchingSkill = skill;
    }

    public RatCatchingSkill getRatCatchingSkill() { return ratCatchingSkill; }

    public void catchRat(Rat rat) {
        rat.setCatcher(this);
    }

    public void eatRat(Rat rat) {
        rat.kill();
    }

    public void removeRat(Rat rat) { }

    @Override
    public void moveTo(Location location) {
        this.setLocation(location);
    }
}