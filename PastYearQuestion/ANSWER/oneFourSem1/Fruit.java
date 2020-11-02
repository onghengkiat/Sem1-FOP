class Fruit {

    protected String name;
    protected String type;

    Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println(type + " " + name);
    }
}
