package Heroes;

import Exceptions.CantListenToItselfException;

public class Detective extends Heroes.Character {

    public Detective(String name, Location location) {
        super(name, location);
    }

    public void inspectCharacter(Character character) {
        System.out.println(this.getName() + " следит за " + character.getName());
        System.out.println("Выяснил: " + character.getName() + " находится в " + character.getLastLocation() );
    }

    @Override
    public void listenTo(Character character) throws CantListenToItselfException {
        if (this.equals(character)) {
            throw new CantListenToItselfException(" Нельзя прислушаться к самому себе ");
        }
        else{System.out.println(this.getName() + " слушает " + character.getName());}
    }
}