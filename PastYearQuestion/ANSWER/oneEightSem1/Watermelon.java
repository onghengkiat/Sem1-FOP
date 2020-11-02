package oneEightSem1;

class Watermelon extends Fruit{
    private double weight;

    public Watermelon(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }
    public double totalPrice() {
        if(type.equalsIgnoreCase("local")){
            if(weight < 2){
                return 2.25*weight;
            }else if (weight >= 2 && weight <= 5){
                return 1.95*weight;
            }else{
                return 1.65*weight;
            }
        }

        if(type.equalsIgnoreCase("Imported")){
            if(weight < 2){
                return 3.75*weight;
            }else if (weight >= 2 && weight <= 5){
                return 3.45*weight;
            }else{
                return 3.15*weight;
            }
        }

        return 0 ;
    }

    public String toString(){
        return name + " - " + weight + "kg = RM " + totalPrice();
    }
}
