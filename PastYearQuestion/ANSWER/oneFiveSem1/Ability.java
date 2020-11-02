import java.util.Random;

class Ability extends Hero {

    public Ability(String name, String type, int health) {
        super(name, type);
        this.health = health;
    }

    public void damage(Hero a, Hero b) {
        Random rnd = new Random();
        int damage = (rnd.nextInt(5) + 1) * rnd.nextInt(4);
        b.setHealth(b.getHealth() - damage);

        System.out.print(a.getName() + " damage " + damage + " *** ");
        b.display();
        System.out.println("");
    }
}
