package oneEightSem1;

abstract class Fruit{

    protected String name;
    protected String type;

    Fruit(String name, String type){
        this.name = name;
        this.type = type;
    }

    public abstract double totalPrice();

    public String toString(){
        return "Name: " + name +
                "\nType: " + type ;
    }
}
