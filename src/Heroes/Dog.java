package Heroes;

import java.util.*;

public abstract class Dog implements Movable {
    public List<Rat> rats = new ArrayList<>();
    private String name;
    private Location location;

    public Dog(String name, Location location){
        this.name = name;
        this.location = location;
    }



    public List<Rat> getRats() { return rats; }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void giveRat(Dog dog, Rat rat) {
        dog.rats.add(rat);
        this.rats.remove(rat);
    }
    public void removeRat(Rat rat) { rats.remove(rat); }

    public void listenTo(Character character) {
        System.out.println(this.getName() + "внимательно слушает" + character.getName());
    }

   /* public void removeRat(Rat rat) {
        if (rats.remove(rat)){
            System.out.println("Dog: " + getName() + " removed rat: " + rat.toString() + ".");
        } else {
            System.out.println("Dog: " + getName() + " didn't have this rat: " + rat.toString() + ".");
        }
    }*/


    @Override
    public String toString() {
        return "Собака по имени " + name + '\'' +
                ", крысы " + rats +
                ", находится в " + location;
    }
}
