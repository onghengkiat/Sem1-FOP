class Hero {
    protected String name;
    protected String type;
    protected int health;

    public Hero(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void display() {
        System.out.println(name + " (" + type + ") - HP: " + health);
    }
}
