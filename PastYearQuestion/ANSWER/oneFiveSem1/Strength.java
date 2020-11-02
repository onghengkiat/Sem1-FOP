import java.util.Random;

class Strength extends Hero {

    public Strength(String name, String type, int health) {
        super(name, type);
        this.health = health;
    }

    public void damage(Hero a, Hero b) {
        Random rnd = new Random();
        int damage = rnd.nextInt(8) + 3;
        b.setHealth(b.getHealth() - damage);

        System.out.print(a.getName() + " damage " + damage + " *** ");
        b.display();
        System.out.println("");
    }
}
