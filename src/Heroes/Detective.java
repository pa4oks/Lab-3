package Heroes;

class Detective extends Heroes.Character {

    public Detective(String name, Location location) {
        super(name, location);
    }

    public void inspectCharacter(Character character) {
        System.out.println(this.getName() + "следит за" + character.getName());
        System.out.println("Выяснил:" + "\n" + "Имя:" + character.getName() + "находится в" + character.getLastLocation() );
    }

    @Override
    public void listenTo(Character character) {
        System.out.println(this.getName() + "внимательно слушает" + character.getName());
    }
}