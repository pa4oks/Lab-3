package Heroes;

import Heroes.Movable;
import Heroes.Rat;
import Heroes.RatEnjoyer;

import java.util.ArrayList;
import java.util.*;

 public class Location {
    private String name;
    private String smelling;
    private List<Movable> currentVisitors = new ArrayList<>();

    public Location(String name, String smelling) {
        this.name = name;
        this.smelling = smelling;
    }

    public String getName() {
        return name;
    }

    public String getSmelling() {
        return smelling;
    }

    public void setSmelling(String smelling) {
        this.smelling = smelling;
    }

    public void addVisitor(Movable movable) {
        currentVisitors.add(movable);
    }
    public void removeVisitor(Movable movable) {
        currentVisitors.remove(movable);
    }

    public List<Movable> getCurrentVisitors() {
        return currentVisitors;
    }

    /*public boolean hasRats() {
        for (RatEnjoyer.Movable visitor : currentVisitors) {
            if (visitor instanceof Rat) {
                return true; // If at least one Rat is found, return true
            }
        }
        return false; // If no Rats are found, return false
    }*/

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", smelling='" + smelling + '\'' +
                ", currentVisitors=" + currentVisitors +
                '}';
    }
}
