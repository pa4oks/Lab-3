package Heroes;

//import Nonphysical.Emotion;

import java.util.*;

    class Character implements Movable {
    private String name;
    private List<Location> locationHistory = new ArrayList<>();
    private Emotion emotion;

    public Character(String name, Location initialLocation) {
        this.name = name;
        this.locationHistory.add(initialLocation);
        this.emotion = new Emotion("Neutral", 0); // Default emotion
    }

    public String getName() { return name; }
    public Location getLastLocation() { return locationHistory.get(locationHistory.size() - 1); }
    public void addLocation(Location location) { locationHistory.add(location); }

    public void moveTo(Location location) {
        addLocation(location);
        location.addVisitor(this);
    }

    public Emotion getEmotion() { return emotion; }

    public void setEmotion(Emotion emotion) { this.emotion = emotion; }

    public void listenTo(Character character){
        System.out.println(this.getName() + "слушает" + character.getName());
    }


    }