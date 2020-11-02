class Apple extends onefoursem1.Fruit {
    private double weight;

    public Apple(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }

    public double totalPrice() {
        if(type.equalsIgnoreCase("Green")){
            return weight*7.2;
        }else if(type.equalsIgnoreCase("Red")){
            return weight*8.3;
        }
        return 0;
    }

    public void display(){
        super.display();
        System.out.println(weight + " KG - RM  " + totalPrice());
    }
}
