package Heroes;

import Exceptions.CantCatchRatInOtherLocationException;
import Exceptions.CantListenToItselfException;

public class RatCatcher extends Dog {
    private RatCatchingSkill ratCatchingSkill;

    public RatCatcher(String name, Location location, RatCatchingSkill skill) {
        super(name, location);
        this.ratCatchingSkill = skill;
    }

    public RatCatchingSkill getRatCatchingSkill() { return ratCatchingSkill; }

    public void catchRat(Rat rat) throws CantCatchRatInOtherLocationException {
        if (this.getLocation().equals(rat.getLocation())) {
            rat.setCatcher(this);
        }
        else{
            throw new CantCatchRatInOtherLocationException("Нельзя ловить крысу в другой локации");
        }
    }

    public void eatRat(Rat rat) {
        System.out.println(this.getName() + " съел крысу");
        rat.kill();
    }

    public void removeRat(Rat rat) { }

    @Override
    public void moveTo(Location location) {
        this.setLocation(location);
    }
}